package top.pcstar.springbootmybatis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.pcstar.springbootmybatis.entity.Test;
import top.pcstar.springbootmybatis.mapper.Test1Mapper;
import top.pcstar.springbootmybatis.mapper.TestMapper;
import top.pcstar.springbootmybatis.service.TestService;

/**
 * @Author: PanChao
 * @Description:
 * @Date: Created in 16:36 2018/7/17
 */
@Service
public class TestServiceImpl implements TestService {
//    @Autowired
//    private TestMapper testMapper;
    @Autowired
    private Test1Mapper testMapper;
    @Override
    public Test getTestByName(String name) {
        System.out.println("getTestByName");
        return testMapper.findByName(name);
    }

    @Override
    public int addTest(String name, String sex) {
        return testMapper.insert(name, sex);
    }
}
