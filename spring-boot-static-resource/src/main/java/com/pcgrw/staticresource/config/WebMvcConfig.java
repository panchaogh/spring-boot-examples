package com.pcgrw.staticresource.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @ClassName WebMvcConfig
 * @Description Web配置类
 * @Author panchao
 * @Date 2019/6/8 18:08
 * @Version 1.0
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //将所有/custom/**访问都映射到D:/custom/路径下
        registry.addResourceHandler("/custom/**")
                .addResourceLocations("file:D:/custom/");
    }
}
