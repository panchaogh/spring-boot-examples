package com.pcgrw.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @ClassName PersonProperties
 * @Description 自定义属性类
 * @Author panchao
 * @Date 2019/6/9 12:35
 * @Version 1.0
 */
@Data
@ConfigurationProperties(prefix = "custom.person")
public class PersonProperties {
    private String name;
    private int age;
    private String sex = "M";
}
