package kr.hs.dgsw.shopping_back.Domain;

import lombok.Data;

import java.time.LocalDateTime;

/*
- 메인
인기 상품 : 가장 많이 구매한 상품 중 4개 표시
특가 상품 : 시중가격-판매가격 중 상위 상품 표시
이 달의 Best 상품 : 추천상품 + 판매개수 중 가장 높은 판매상품 표시
베스트 추천상품 : 추천상품들 중 가장 많이 판매한 추천상품 표시
- 카테고리 별
신상품코너 : 가장 최근의 상품 등록일 기준 상위 4개 표시
인기 상품 : 카테고리 별 많이 구매한 상품들 표시
 */

@Data
public class Product {
    private Long id; //상품 고유 아이디
    private Long productId; //상위 분류 아이디
    private String category; //상위 분류
    private String lowcategory; //Sub 분류

    /*
    productkind value 설명
    1 : 추천 상품(카테고리 별 MD 추천상품과 동일)
    2 : 공동구매
    3 : 이벤트상품
     */
    private int productkind;

    private String name; //이름
    private String content; //상품내용
    private String detail; //상세정보
    private int normalprice; //시중가격
    private int sellprice; //판매가격
    private int mileage; //마일리지
    private LocalDateTime created; //제품 등록일
    private LocalDateTime updated;

}
