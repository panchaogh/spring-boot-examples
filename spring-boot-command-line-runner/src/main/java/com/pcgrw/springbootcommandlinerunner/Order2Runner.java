package com.pcgrw.springbootcommandlinerunner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @ClassName Order2Runner
 * @Description Order2 Runner
 * @Author panchao
 * @Date 2019/6/5 19:14
 * @Version 1.0
 */
@Component
@Order(2)
public class Order2Runner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.err.println("Order2Runner...");
    }
}
