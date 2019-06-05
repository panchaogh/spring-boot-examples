package com.pcgrw.springbootcommandlinerunner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @ClassName Order1Runner
 * @Description Order1 Runner
 * @Author panchao
 * @Date 2019/6/5 19:14
 * @Version 1.0
 */
@Component
@Order(1)
public class Order1Runner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.err.println("Order1Runner...");
    }
}
