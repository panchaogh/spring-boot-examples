package com.pcgrw.service;

import com.pcgrw.config.PersonProperties;

/**
 * @ClassName PersonService
 * @Description PersonService
 * @Author panchao
 * @Date 2019/6/9 12:42
 * @Version 1.0
 */
public class PersonService {
    private PersonProperties properties;

    public PersonService() {
    }

    public PersonService(PersonProperties properties) {
        this.properties = properties;
    }

    public void sayHello() {
        System.out.println("大家好，我叫: " + properties.getName() + ", 今年" + properties.getAge() + "岁"
                + ", 性别: " + properties.getSex());
    }
}
