package top.pcstar.springboothelloworld.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author: PanChao
 * @Description: 启动类
 * @Date: Created in 12:56 2018/5/29
 */
@EnableAutoConfiguration
@ComponentScan(basePackages = "top.pcstar.springboothelloworld.controller")
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
