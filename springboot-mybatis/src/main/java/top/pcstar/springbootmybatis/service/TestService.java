package top.pcstar.springbootmybatis.service;

import top.pcstar.springbootmybatis.entity.Test;

/**
 * @Author: PanChao
 * @Description:
 * @Date: Created in 16:34 2018/7/17
 */
public interface TestService {
    Test getTestByName(String name);

    int addTest(String name, String sex);
}
