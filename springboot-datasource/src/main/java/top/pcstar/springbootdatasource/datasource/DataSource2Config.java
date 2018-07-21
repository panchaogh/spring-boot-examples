package top.pcstar.springbootdatasource.datasource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * @Author: PanChao
 * @Description: DataSource2Config
 * @Date: Created in 15:15 2018/7/16
 */
@MapperScan(basePackages = "top.pcstar.springbootdatasource.test2", sqlSessionFactoryRef = "test2SqlSessionFactory")
@Configuration
public class DataSource2Config {
    /**
     * 获取DataSourceProperties配置文件
     *
     * @return
     */
    @Bean("test2DataSourceProperties")
    @ConfigurationProperties("spring.datasource.test2")
    public DataSourceProperties getDataSourceProperties() {
        return new DataSourceProperties();
    }

    /**
     * 创建数据源
     *
     * @return
     */
    @Bean("test2DataSource")
    public DataSource getDataSource() {
        return getDataSourceProperties().initializeDataSourceBuilder().build();
    }

    /**
     * test2 sql会话工厂
     *
     * @param test2DataSource
     * @return
     * @throws Exception
     */
    @Bean("test2SqlSessionFactory")
    public SqlSessionFactory getSqlSessionFactory(@Qualifier("test2DataSource") DataSource test2DataSource) throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(test2DataSource);
        sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources("classpath:mapper/test2/*.xml"));
        return sqlSessionFactoryBean.getObject();
    }

    /**
     * test2 事务管理
     *
     * @param test2DataSource
     * @return
     */
    @Bean("test2DataSourceTransactionManager")
    public DataSourceTransactionManager getDataSourceTransactionManager(@Qualifier("test2DataSource") DataSource test2DataSource) {
        return new DataSourceTransactionManager(test2DataSource);
    }

    /**
     * test2 sql会话模板
     *
     * @param test2SqlSessionFactory
     * @return
     */
    @Bean("test2SqlSessionTemplate")
    public SqlSessionTemplate getSqlSessionTemplate(@Qualifier("test2SqlSessionFactory") SqlSessionFactory test2SqlSessionFactory) {
        return new SqlSessionTemplate(test2SqlSessionFactory);
    }
}
