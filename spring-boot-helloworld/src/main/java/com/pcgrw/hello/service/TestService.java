package com.pcgrw.hello.service;

import com.pcgrw.hello.entity.Test;

import java.util.List;

/**
 * @Author: PanChao
 * @Description:
 * @Date: Created in 20:47 2018/7/15
 */
public interface TestService {
    void insterTest(String name,String sex);
    List<Test> selectTest();
}
