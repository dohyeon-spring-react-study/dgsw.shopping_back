package kr.hs.dgsw.shopping_back.Domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Basket {
    private Long id; //고유 아이디
    private Long userId; //유저 아이디
    private String productname; //
    private int price;
    private int count;

    private LocalDateTime created;
    private LocalDateTime updated;
}
