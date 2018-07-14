package top.pcstar.springbootblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import top.pcstar.springbootblog.domain.Comment;

/**
 * Comment 仓库.
 *
 * @author <a href="https://waylau.com">Way Lau</a>
 * @since 1.0.0 2017年4月7日
 */
public interface CommentRepository extends JpaRepository<Comment, Long> {

}
