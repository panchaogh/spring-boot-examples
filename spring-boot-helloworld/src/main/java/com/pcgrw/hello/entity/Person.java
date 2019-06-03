package com.pcgrw.hello.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Author: PanChao
 * @Description:
 * @Date: Created in 20:25 2018/7/22
 */
@ConfigurationProperties("person")
public class Person {
    private String name;
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
