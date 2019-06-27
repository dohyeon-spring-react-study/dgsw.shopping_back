package kr.hs.dgsw.shopping_back.Service;

import kr.hs.dgsw.shopping_back.Domain.Basket;
import kr.hs.dgsw.shopping_back.Domain.BasketMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasketServiceImpl implements BasketService {

    @Autowired
    private BasketMapper basketMapper;

    @Override
    public Long addBasket(Basket basket) {
        return basketMapper.addBasket(basket);
    }

    @Override
    public List findByUserId(String userId) {
        return basketMapper.findByUserId(userId);
    }
}
