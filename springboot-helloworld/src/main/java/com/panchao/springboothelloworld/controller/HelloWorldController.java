package com.panchao.springboothelloworld.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: PanChao
 * @Description:
 * @Date: Created in 19:03 2018/5/6
 */
//让 SpringBoot根据应用所声明的依赖来对 Spring 框架进行自动配置
@EnableAutoConfiguration
//表示该接口全部返回json格式
@RestController
@RequestMapping("/HelloWorldController")
public class HelloWorldController {
    @RequestMapping("/index")
    public String index(){
        return "success";
    }
    @RequestMapping("/getMap")
    public Map<String,Object> getMap(){
        Map<String,Object> result = new HashMap<>();
        result.put("errorCode","200");
        result.put("errorMsg","成功");
        return result;
    }

    public static void main(String[] args) {
        //主函数运行SpringBoot项目
        SpringApplication.run(HelloWorldController.class,args);
    }
}
