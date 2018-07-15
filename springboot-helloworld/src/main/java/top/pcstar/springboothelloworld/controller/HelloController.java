package top.pcstar.springboothelloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: PanChao
 * @Description:
 * @Date: Created in 18:59 2018/5/28
 */
@RestController
//@EnableAutoConfiguration
public class HelloController {
    @RequestMapping("/hello")
    public String index() {
        return "Hello World!";
    }

    /**
     * SpringBoot启动方式1（用来学习，实际过程中不用这种启动方式）
     * @param args
     */
//    public static void main(String[] args) {
//        SpringApplication.run(HelloController.class, args);
//    }
}
