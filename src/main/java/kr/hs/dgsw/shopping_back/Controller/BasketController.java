package kr.hs.dgsw.shopping_back.Controller;

import kr.hs.dgsw.shopping_back.Domain.Basket;
import kr.hs.dgsw.shopping_back.Service.BasketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("api/basket")
public class BasketController {

    @Autowired
    private BasketService basketService;

    @PostMapping("/addbasket")
    public Long addBasket(@RequestBody Basket basket){
        return basketService.addBasket(basket);
    }

    @GetMapping("/findbasket/{userId}")
    public List findByUserId(@PathVariable String userId){
        return basketService.findByUserId(userId);
    }

    @PutMapping("/setcount")
    public Long setCount(@RequestBody Basket basket){
        return basketService.setBasket(basket);
    }

    @DeleteMapping("/deletebasket")
    public Long deleteById(@RequestBody Basket basket){
        return basketService.deleteById(basket);
    }

    @DeleteMapping("/deleteall/{userId}")
    public Long deleteAll(@PathVariable Long userId){
        return basketService.deleteAll(userId);
    }

}
