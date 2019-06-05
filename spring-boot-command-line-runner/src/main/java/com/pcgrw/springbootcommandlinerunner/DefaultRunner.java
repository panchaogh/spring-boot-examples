package com.pcgrw.springbootcommandlinerunner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @ClassName DefaultRunner
 * @Description 默认Runner
 * @Author panchao
 * @Date 2019/6/5 19:12
 * @Version 1.0
 */
@Component
public class DefaultRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.err.println("DefaultRunner...");
    }
}
