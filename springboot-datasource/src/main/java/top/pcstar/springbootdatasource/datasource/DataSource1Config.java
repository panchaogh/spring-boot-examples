package top.pcstar.springbootdatasource.datasource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @Author: PanChao
 * @Description:
 * @Date: Created in 15:15 2018/7/16
 */
@MapperScan(basePackages = "top.pcstar.springbootdatasource.test1")
@Configuration
public class DataSource1Config {
    @Bean("test1DataSource")
    @ConfigurationProperties("spring.datasource.test1")
    public DataSource getDataSource() {
        return DataSourceBuilder.create().build();
    }

}
