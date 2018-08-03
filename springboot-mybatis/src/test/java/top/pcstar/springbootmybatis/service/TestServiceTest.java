package top.pcstar.springbootmybatis.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import top.pcstar.springbootmybatis.SpringbootMybatisApplicationTests;

import static org.junit.Assert.*;

/**
 * @Author: PanChao
 * @Description:
 * @Date: Created in 11:09 2018/8/3
 */
public class TestServiceTest extends SpringbootMybatisApplicationTests {
    @Autowired
    private TestService testService;
    @Test
    public void getTestByName() {
        top.pcstar.springbootmybatis.entity.Test test = testService.getTestByName("zhangsan");
        assertEquals("与期望值不一致!!!!!!!!!!!!!!!!!!!!!!","男",test.getSex());
    }

    @Test
    public void addTest() {
        int i = testService.addTest("wangwu","男");
        assertEquals(1,i);
    }
}