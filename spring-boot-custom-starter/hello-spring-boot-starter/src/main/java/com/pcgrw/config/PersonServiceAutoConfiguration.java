package com.pcgrw.config;

import com.pcgrw.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName PersonServiceAutoConfiguration
 * @Description 配置文件
 * @Author panchao
 * @Date 2019/6/9 12:44
 * @Version 1.0
 */
@Configuration
@EnableConfigurationProperties(PersonProperties.class)
@ConditionalOnClass(PersonService.class) //当类路径classpath下有指定的类的情况下进行自动配置
@ConditionalOnProperty(prefix = "custom.person", value = "enabled", matchIfMissing = true) //当配置文件中custom.person.enabled=true时进行自动配置，如果没有设置此值就默认使用matchIfMissing对应的值
public class PersonServiceAutoConfiguration {
    @Autowired
    private PersonProperties properties;

    public PersonServiceAutoConfiguration() {
    }

    @Bean
    @ConditionalOnMissingBean  // 当容器中没有指定Bean的情况下，自动配置PersonService类
    public PersonService getPersonService() {
        PersonService personService = new PersonService(properties);
        return personService;
    }
}
