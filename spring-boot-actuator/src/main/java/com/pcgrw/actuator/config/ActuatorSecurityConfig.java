package com.pcgrw.actuator.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @ClassName ActuatorSecurityConfig
 * @Description Spring Boot Actuator,只对Spring Boot Actuator进行安全验证
 * @Author panchao
 * @Date 2019/6/9 11:57
 * @Version 1.0
 */
@Configuration
public class ActuatorSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    Environment env;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        String contextPath = env.getProperty("management.endpoints.web.base-path");
        contextPath = contextPath == null ? "" : contextPath;
        http.csrf().disable();
        http.authorizeRequests().antMatchers("/**" + contextPath + "/**").authenticated()
                .anyRequest().permitAll().and().httpBasic();
    }
}
