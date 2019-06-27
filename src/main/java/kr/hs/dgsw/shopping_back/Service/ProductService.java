package kr.hs.dgsw.shopping_back.Service;

import kr.hs.dgsw.shopping_back.Domain.Product;

import java.util.List;

public interface ProductService {
    List<Product> getProduct(String productId);
    List<Product> getLowProduct(String productId);
    Product getDetailProduct(String id);
}
