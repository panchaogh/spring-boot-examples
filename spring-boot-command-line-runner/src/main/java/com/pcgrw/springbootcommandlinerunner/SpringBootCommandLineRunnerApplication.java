package com.pcgrw.springbootcommandlinerunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootCommandLineRunnerApplication {

    public static void main(String[] args) {
        System.err.println("The service to start.");
        SpringApplication.run(SpringBootCommandLineRunnerApplication.class, args);
        System.err.println("The service has started.");
    }

}
