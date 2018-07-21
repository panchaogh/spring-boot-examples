package top.pcstar.springbootdatasource.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.pcstar.springbootdatasource.entity.Test;
import top.pcstar.springbootdatasource.service.TestService;
import top.pcstar.springbootdatasource.test1.mapper.Test1Mapper;
import top.pcstar.springbootdatasource.test2.mapper.Test2Mapper;

/**
 * @Author: PanChao
 * @Description:
 * @Date: Created in 16:36 2018/7/17
 */
@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private Test1Mapper test1Mapper;
    @Autowired
    private Test2Mapper test2Mapper;

    @Override
    public Test getTest1ByName(String name) {
        System.out.println("getTest1ByName");
        return test1Mapper.findByName(name);
    }
    @Transactional(transactionManager = "test1DataSourceTransactionManager")
    @Override
    public int addTest1(String name, String sex) {
        System.out.println("addTest1");
        int result = test1Mapper.insert(name, sex);
        addTest2(name, sex);
//        int i = 1/0;
        return result;
    }

    @Override
    public Test getTest2ByName(String name) {
        System.out.println("getTest2ByName");
        return test2Mapper.findByName(name);
    }
    @Transactional(transactionManager = "test2DataSourceTransactionManager")
    @Override
    public int addTest2(String name, String sex) {
        System.out.println("addTest2");
        int result = test2Mapper.insert(name, sex);
//        int i = 1/0;
        return result;
    }
}