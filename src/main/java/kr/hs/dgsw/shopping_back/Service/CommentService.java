package kr.hs.dgsw.shopping_back.Service;

import kr.hs.dgsw.shopping_back.Domain.Comment;

import java.util.List;

public interface CommentService {
    List findByProductId(Long productId);
    Long addComment(Comment comment);
}
