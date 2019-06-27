package kr.hs.dgsw.shopping_back.Domain;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {
    List<Product> getProduct(String productId);
    List<Product> getLowProduct(String productId);
    Product getDetailProduct(String id);
}
