package top.pcstar.springbootdatasource.datasource;

import com.mysql.jdbc.jdbc2.optional.MysqlXADataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.jta.atomikos.AtomikosDataSourceBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import top.pcstar.springbootdatasource.config.DBConfig1;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @Author: PanChao
 * @Description: DataSource1Config
 * @Date: Created in 15:15 2018/7/16
 */
@MapperScan(basePackages = "top.pcstar.springbootdatasource.test1", sqlSessionFactoryRef = "test1SqlSessionFactory")
@Configuration
public class MyBatisConfig1 {
    /**
     * 创建数据源
     *
     * @return
     */
    @Primary
    @Bean("test1DataSource")
    public DataSource getDataSource(DBConfig1 dbConfig1) throws SQLException {
        MysqlXADataSource mysqlXaDataSource = new MysqlXADataSource();
        mysqlXaDataSource.setUrl(dbConfig1.getUrl());
        mysqlXaDataSource.setPinGlobalTxToPhysicalConnection(true);
        mysqlXaDataSource.setPassword(dbConfig1.getPassword());
        mysqlXaDataSource.setUser(dbConfig1.getUsername());
        mysqlXaDataSource.setPinGlobalTxToPhysicalConnection(true);

        AtomikosDataSourceBean xaDataSource = new AtomikosDataSourceBean();
        xaDataSource.setXaDataSource(mysqlXaDataSource);
        xaDataSource.setUniqueResourceName("test1DataSource");

        xaDataSource.setMinPoolSize(dbConfig1.getMinPoolSize());
        xaDataSource.setMaxPoolSize(dbConfig1.getMaxPoolSize());
        xaDataSource.setMaxLifetime(dbConfig1.getMaxLifetime());
        xaDataSource.setBorrowConnectionTimeout(dbConfig1.getBorrowConnectionTimeout());
        xaDataSource.setLoginTimeout(dbConfig1.getLoginTimeout());
        xaDataSource.setMaintenanceInterval(dbConfig1.getMaintenanceInterval());
        xaDataSource.setMaxIdleTime(dbConfig1.getMaxIdleTime());
        xaDataSource.setTestQuery(dbConfig1.getTestQuery());
        return xaDataSource;
    }

    /**
     * test1 sql会话工厂
     *
     * @param test1DataSource
     * @return
     * @throws Exception
     */
    @Primary
    @Bean("test1SqlSessionFactory")
    public SqlSessionFactory getSqlSessionFactory(@Qualifier("test1DataSource") DataSource test1DataSource) throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(test1DataSource);
        sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources("classpath:mapper/test1/*.xml"));
        return sqlSessionFactoryBean.getObject();
    }

    /**
     * test1 sql会话模板
     *
     * @param test1SqlSessionFactory
     * @return
     */
    @Primary
    @Bean("test1SqlSessionTemplate")
    public SqlSessionTemplate getSqlSessionTemplate(@Qualifier("test1SqlSessionFactory") SqlSessionFactory test1SqlSessionFactory) {
        return new SqlSessionTemplate(test1SqlSessionFactory);
    }
}
