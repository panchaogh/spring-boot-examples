package top.pcstar.springboothelloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.Entity;

/**
 * @Author: PanChao
 * @Description: 启动类
 * @Date: Created in 12:56 2018/5/29
 */
//@EnableAutoConfiguration
//@ComponentScan(basePackages = "top.pcstar.springboothelloworld.controller")
//@EntityScan("top.pcstar.springboothelloworld.entity")
//@EnableJpaRepositories("top.pcstar.springboothelloworld.dao")
@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
