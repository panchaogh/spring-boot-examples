package top.pcstar.springbootblog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.pcstar.springbootblog.domain.Comment;
import top.pcstar.springbootblog.repository.CommentRepository;
import top.pcstar.springbootblog.service.CommentService;

import javax.transaction.Transactional;

/**
 * Comment 服务.
 *
 * @author <a href="https://waylau.com">Way Lau</a>
 * @since 1.0.0 2017年4月9日
 */
@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentRepository commentRepository;

    /* (non-Javadoc)
     * @see com.waylau.spring.boot.blog.service.CommentService#removeComment(java.lang.Long)
     */
    @Override
    @Transactional
    public void removeComment(Long id) {
        commentRepository.deleteById(id);
    }

    @Override
    public Comment getCommentById(Long id) {
        return commentRepository.findById(id).get();
    }

}
