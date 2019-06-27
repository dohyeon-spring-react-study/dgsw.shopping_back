package kr.hs.dgsw.shopping_back.Controller;


import kr.hs.dgsw.shopping_back.Domain.Product;
import kr.hs.dgsw.shopping_back.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/getproduct/{productId}")
    public List getProduct(@PathVariable String productId){
        return productService.getProduct(productId);
    }

    @GetMapping("/lowproduct/{productId}")
    public List lowProduct(@PathVariable String productId){
        return productService.getLowProduct(productId);
    }

    @GetMapping("/detailproduct/{id}")
    public Product detailProduct(@PathVariable String id){
        return productService.getDetailProduct(id);
    }
}
