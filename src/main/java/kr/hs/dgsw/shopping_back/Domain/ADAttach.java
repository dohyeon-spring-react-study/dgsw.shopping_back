package kr.hs.dgsw.shopping_back.Domain;

import lombok.Data;

import java.time.LocalDateTime;

//광고 배너 저장 테이블
@Data
public class ADAttach {
    private Long id;
    private String filename;
    private String filepath;
    private LocalDateTime created;
    private LocalDateTime updated;
}
