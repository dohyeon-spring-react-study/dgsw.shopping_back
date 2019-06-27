package kr.hs.dgsw.shopping_back.Domain;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BasketMapper {
    Long addBasket(Basket basket);
    List findByUserId(String userId);
}
