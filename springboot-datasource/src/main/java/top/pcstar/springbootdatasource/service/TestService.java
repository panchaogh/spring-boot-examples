package top.pcstar.springbootdatasource.service;

import top.pcstar.springbootdatasource.entity.Test;

/**
 * @Author: PanChao
 * @Description:
 * @Date: Created in 16:34 2018/7/17
 */
public interface TestService {
    Test getTest1ByName(String name);

    int addTest1(String name, String sex);

    Test getTest2ByName(String name);

    int addTest2(String name, String sex);
}
