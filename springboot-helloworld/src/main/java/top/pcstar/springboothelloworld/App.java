package top.pcstar.springboothelloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import top.pcstar.springboothelloworld.entity.Person;

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
@EnableScheduling
@EnableAsync
@EnableConfigurationProperties(Person.class)
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
