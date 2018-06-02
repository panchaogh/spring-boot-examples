package top.pcstar.springbootthymeleaf.repository;

import org.springframework.data.repository.CrudRepository;
import top.pcstar.springbootthymeleaf.domain.User;

/**
 * @Author: PanChao
 * @Description: 用户仓库
 * @Date: Created in 16:17 2018/6/1
 */
public interface UserRepository extends CrudRepository<User, Long> {
}
