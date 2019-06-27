package kr.hs.dgsw.shopping_back.Controller;

import kr.hs.dgsw.shopping_back.Service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/comment")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @GetMapping("/getcomment/{productId}")
    public List findByProductId(@PathVariable Long productId){
        return commentService.findByProductId(productId);
    }
}
