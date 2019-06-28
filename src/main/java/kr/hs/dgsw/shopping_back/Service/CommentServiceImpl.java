package kr.hs.dgsw.shopping_back.Service;

import kr.hs.dgsw.shopping_back.Domain.Comment;
import kr.hs.dgsw.shopping_back.Domain.CommentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentMapper commentMapper;

    @Override
    public List findByProductId(Long productId) {
        return commentMapper.findByProductId(productId);
    }

    @Override
    public Long addComment(Comment comment) {
        return commentMapper.addComment(comment);
    }
}
