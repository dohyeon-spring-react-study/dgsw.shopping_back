package kr.hs.dgsw.shopping_back.Service;

import java.util.List;

public interface CommentService {
    List findByProductId(Long productId);
}
