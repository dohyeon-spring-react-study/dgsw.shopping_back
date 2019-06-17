package kr.hs.dgsw.shopping_back.Domain;

import lombok.Data;

import java.time.LocalDateTime;

//상품 사진 저장 테이블
@Data
public class ProductAttach {
    private Long id;
    private Long productId;
    private String filename;
    private String filepath;
    private LocalDateTime created;
    private LocalDateTime updated;
}
