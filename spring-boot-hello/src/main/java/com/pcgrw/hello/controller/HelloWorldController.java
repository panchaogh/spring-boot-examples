package com.pcgrw.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloWorldController
 * @Description Hello World控制器
 * @Author panchao
 * @Date 2019/6/3 11:52
 * @Version 1.0
 */
@RestController
public class HelloWorldController {
    @GetMapping("hello")
    public String helloWorld() {
        return "Hello World!";
    }
}
