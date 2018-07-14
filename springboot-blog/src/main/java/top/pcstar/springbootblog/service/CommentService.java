package top.pcstar.springbootblog.service;

import top.pcstar.springbootblog.domain.Comment;

/**
 * Comment 服务接口.
 *
 * @author <a href="https://waylau.com">Way Lau</a>
 * @since 1.0.0 2017年4月9日
 */
public interface CommentService {
    /**
     * 根据id获取 Comment
     *
     * @param id
     * @return
     */
    Comment getCommentById(Long id);

    /**
     * 删除评论
     *
     * @param id
     * @return
     */
    void removeComment(Long id);
}
