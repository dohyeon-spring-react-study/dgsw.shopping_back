package kr.hs.dgsw.shopping_back.Domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Comment {
    private Long id; //고유 아이디
    private Long productId; //상품 고유 아이디
    private String useraccount; //유저 아이디
    private String content; //상품 평
    private LocalDateTime created;
    private LocalDateTime updated;
}
