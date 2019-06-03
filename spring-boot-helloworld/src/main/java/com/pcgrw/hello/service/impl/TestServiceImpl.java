package com.pcgrw.hello.service.impl;

import com.pcgrw.hello.dao.TestDao;
import com.pcgrw.hello.entity.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import com.pcgrw.hello.service.TestService;

import java.util.List;

/**
 * @Author: PanChao
 * @Description: JdbcTemplate测试
 * @Date: Created in 20:48 2018/7/15
 */
@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private TestDao testDao;
    @Override
    public void insterTest(String name,String sex) {
        System.out.println("insterTest开始");
        jdbcTemplate.update("INSERT INTO `test`.`test` (`id`, `name`, `sex`) VALUES (null , ?, ?)", name, sex);
        System.out.println("insterTest结束");
    }
    @Override
    public List<Test> selectTest() {
        System.out.println("selectTest开始");
        List<Test> list = testDao.findAll();
        System.out.println("selectTest结束");
        return list;
    }
}
