package kr.hs.dgsw.shopping_back.Domain;

import org.apache.ibatis.annotations.Mapper;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Mapper
public interface BasketMapper {
    Long addBasket(Basket basket);
    List findByUserId(String userId);
    Long setCount(Basket basket);
    Long deleteById(Basket basket);
    Long deleteAll(Long userId);
}
