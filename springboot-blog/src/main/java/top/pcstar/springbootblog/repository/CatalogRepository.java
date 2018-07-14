package top.pcstar.springbootblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import top.pcstar.springbootblog.domain.Catalog;
import top.pcstar.springbootblog.domain.User;

import java.util.List;

/**
 * Catalog 仓库.
 *
 * @author <a href="https://waylau.com">Way Lau</a>
 * @since 1.0.0 2017年4月10日
 */
public interface CatalogRepository extends JpaRepository<Catalog, Long> {

    /**
     * 根据用户查询
     *
     * @param user
     * @return
     */
    List<Catalog> findByUser(User user);

    /**
     * 根据用户查询
     *
     * @param user
     * @param name
     * @return
     */
    List<Catalog> findByUserAndName(User user, String name);
}
