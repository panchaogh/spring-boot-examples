package com.pcgrw.customstartertest;

import com.pcgrw.service.PersonService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootCustomStarterTestApplicationTests {
    @Autowired
    private PersonService personService;

    @Test
    public void contextLoads() {
        personService.sayHello();
    }

}
