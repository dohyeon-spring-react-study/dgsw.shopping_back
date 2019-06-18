package kr.hs.dgsw.shopping_back.Domain;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Data
@Getter
@Setter
public class User {
    private Long id; //고유 아이디
    private String account; //유저 아이디
    private String password; //비밀번호
    private String name; //이름
    private String callnumber; //전화번호
    private String phonenumber; //이름
    private String zipcode; //우편번호
    private String address; //주소
    private String email; //이메일
    private int mileage; //누적 마일리지
    private LocalDateTime created;
    private LocalDateTime updated;
}
