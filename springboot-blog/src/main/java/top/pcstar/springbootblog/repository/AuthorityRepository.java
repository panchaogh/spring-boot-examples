package top.pcstar.springbootblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import top.pcstar.springbootblog.domain.Authority;

/**
 * Authority 仓库.
 *
 * @author <a href="https://waylau.com">Way Lau</a>
 * @since 1.0.0 2017年3月2日
 */
public interface AuthorityRepository extends JpaRepository<Authority, Long> {
}
