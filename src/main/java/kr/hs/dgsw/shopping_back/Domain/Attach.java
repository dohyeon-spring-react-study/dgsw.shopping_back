package kr.hs.dgsw.shopping_back.Domain;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

//상품 사진 저장 테이블
@Data
public class Attach {
    private Long id;
    private Long productId;
    private String filename;
    private String filepath;
    private LocalDateTime created;
    private LocalDateTime updated;

    @Builder
    public Attach(Long productId, String filename, String filepath) {
        this.productId = productId;
        this.filename = filename;
        this.filepath = filepath;
    }
}
