package kr.hs.dgsw.shopping_back.Controller;

import kr.hs.dgsw.shopping_back.Domain.Attach;
import kr.hs.dgsw.shopping_back.Service.AttachService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URLConnection;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

@RestController
public class AttachController {

    @Autowired
    private AttachService attachService;

    @PostMapping("/api/upload/{productId}")
    public HashMap upload(@RequestPart MultipartFile srcFile, @PathVariable Long productId) {
        HashMap<String, Object> map = new HashMap<>();
        try {
            String destFilename
                    = "D:\\Spring_2\\shopping_back\\upload\\"
                    + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy_MM_dd\\"))
                    + srcFile.getOriginalFilename();
            File destFile = new File(destFilename);
            destFile.getParentFile().mkdirs();
            srcFile.transferTo(destFile);

            Attach attach = Attach.builder()
                    .productId(productId)
                    .filename(srcFile.getOriginalFilename())
                    .filepath(destFilename)
                    .build();

            map.put("productId", attach.getProductId());
            map.put("filename", srcFile.getOriginalFilename());
            map.put("filepath", destFilename);

        } catch(Exception ex) {
            map.put("fileId", -1L);
            map.put("error", ex.getLocalizedMessage());
        }
        return map;
    }

    @GetMapping("/api/image/{id}")
    public void image(@PathVariable Long id, HttpServletResponse response) {
        try {
            HashMap map = this.attachService.findById(id);
            Logger logger = LoggerFactory.getLogger(this.getClass().getSimpleName());
            String filename = (String)map.get("filename");
            String filepath = (String)map.get("filepath");

            File file = new File(filepath);
            logger.warn(file.exists()+"");
            if(! file.exists()) return;

            logger.warn(filepath);
            logger.warn(filename);

            String mimeType = URLConnection.guessContentTypeFromName(filepath);
            if(mimeType == null) mimeType = "application/octet-stream";

            response.setContentType(mimeType);
            response.setHeader("Content-Disposition", "inline; filename='" + filename + "'");
            response.setContentLength((int)file.length());

            InputStream is = new BufferedInputStream(new FileInputStream(file));
            FileCopyUtils.copy(is, response.getOutputStream());
        } catch(Exception ex) {
            final Logger logger = LoggerFactory.getLogger(this.getClass().getSimpleName());
            logger.warn(ex.getLocalizedMessage());
        }

    }

}
