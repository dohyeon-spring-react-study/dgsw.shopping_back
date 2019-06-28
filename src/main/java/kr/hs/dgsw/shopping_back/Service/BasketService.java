package kr.hs.dgsw.shopping_back.Service;

import kr.hs.dgsw.shopping_back.Domain.Basket;

import java.util.List;

public interface BasketService {
    Long addBasket(Basket basket);
    List findByUserId(String userId);
    Long setBasket(Basket basket);
    Long deleteById(Basket basket);
    Long deleteAll(Long userId);
}
