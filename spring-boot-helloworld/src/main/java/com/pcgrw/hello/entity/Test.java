package com.pcgrw.hello.entity;

import javax.persistence.*;

/**
 * @Author: PanChao
 * @Description:
 * @Date: Created in 22:07 2018/7/15
 */
@Entity
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //自增策略
    private Integer id;
    @Column
    private String name;
    @Column
    private String sex;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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
}
