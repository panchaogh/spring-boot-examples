package top.pcstar.springbootdatasource.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.pcstar.springbootdatasource.config.DBConfig1;
import top.pcstar.springbootdatasource.config.DBConfig2;
import top.pcstar.springbootdatasource.entity.Test;
import top.pcstar.springbootdatasource.service.TestService;

/**
 * @Author: PanChao
 * @Description:
 * @Date: Created in 16:37 2018/7/17
 */
@RestController
public class TestController {
    @Autowired
    private TestService testService;
    @Autowired
    private DBConfig1 dbConfig1;
    @Autowired
    private DBConfig2 dbConfig2;
    @GetMapping("/getTest1ByName")
    public Test getTest1ByName(String name) {
        System.out.println("getTest1ByName");
        return testService.getTest1ByName(name);
    }

    @GetMapping("/addTest1")
    public void addTest1(String name, String sex) {
        System.out.println("addTest1");
        testService.addTest1(name, sex);
    }

    @GetMapping("/getTest2ByName")
    public Test getTest2ByName(String name) {
        System.out.println("getTest2ByName");
        return testService.getTest2ByName(name);
    }

    @GetMapping("/addTest2")
    public void addTest2(String name, String sex) {
        System.out.println("addTest2");
        testService.addTest2(name, sex);
    }

    @GetMapping("/addAll")
    public void addAll(String name, String sex) {
        System.out.println("addAll");
        testService.addAll(name, sex);
    }

    @GetMapping("/test")
    public void test() {
        System.out.println("--------------"+dbConfig1.getUsername());
        System.out.println("--------------"+dbConfig2.getUsername());
    }
}