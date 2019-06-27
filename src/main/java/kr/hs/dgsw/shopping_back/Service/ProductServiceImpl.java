package kr.hs.dgsw.shopping_back.Service;

import kr.hs.dgsw.shopping_back.Domain.Product;
import kr.hs.dgsw.shopping_back.Domain.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Product> getProduct(String productId) {
        return productMapper.getProduct(productId);
    }

    @Override
    public List<Product> getLowProduct(String productId) {
        return productMapper.getLowProduct(productId);
    }

    @Override
    public Product getDetailProduct(String id) {
        return productMapper.getDetailProduct(id);
    }
}
