package top.pcstar.springbootthymeleaf.repository;

import top.pcstar.springbootthymeleaf.domain.User;

import java.util.List;

/**
 * @Author: PanChao
 * @Description: 用户仓库
 * @Date: Created in 16:17 2018/6/1
 */
public interface UserRepository {
    /**
     * 新增或者修改用户
     * @param user
     * @return
     */
    User saveOrUpateUser(User user);

    /**
     * 删除用户
     * @param id
     */
    void deleteUser(Long id);

    /**
     * 根据用户id获取用户
     * @param id
     * @return
     */
    User getUserById(Long id);

    /**
     * 获取所有用户的列表
     * @return
     */
    List<User> listUser();
}
