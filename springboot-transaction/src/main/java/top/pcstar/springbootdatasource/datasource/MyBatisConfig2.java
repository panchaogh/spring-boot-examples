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
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import top.pcstar.springbootdatasource.config.DBConfig2;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @Author: PanChao
 * @Description: DataSource2Config
 * @Date: Created in 15:15 2018/7/16
 */
@MapperScan(basePackages = "top.pcstar.springbootdatasource.test2", sqlSessionFactoryRef = "test2SqlSessionFactory")
@Configuration
public class MyBatisConfig2 {
    /**
     * 创建数据源
     *
     * @return
     */
    @Bean("test2DataSource")
    public DataSource getDataSource(DBConfig2 dBConfig2) throws SQLException {
        MysqlXADataSource mysqlXaDataSource = new MysqlXADataSource();
        mysqlXaDataSource.setUrl(dBConfig2.getUrl());
        mysqlXaDataSource.setPinGlobalTxToPhysicalConnection(true);
        mysqlXaDataSource.setPassword(dBConfig2.getPassword());
        mysqlXaDataSource.setUser(dBConfig2.getUsername());
        mysqlXaDataSource.setPinGlobalTxToPhysicalConnection(true);

        AtomikosDataSourceBean xaDataSource = new AtomikosDataSourceBean();
        xaDataSource.setXaDataSource(mysqlXaDataSource);
        xaDataSource.setUniqueResourceName("test2DataSource");

        xaDataSource.setMinPoolSize(dBConfig2.getMinPoolSize());
        xaDataSource.setMaxPoolSize(dBConfig2.getMaxPoolSize());
        xaDataSource.setMaxLifetime(dBConfig2.getMaxLifetime());
        xaDataSource.setBorrowConnectionTimeout(dBConfig2.getBorrowConnectionTimeout());
        xaDataSource.setLoginTimeout(dBConfig2.getLoginTimeout());
        xaDataSource.setMaintenanceInterval(dBConfig2.getMaintenanceInterval());
        xaDataSource.setMaxIdleTime(dBConfig2.getMaxIdleTime());
        xaDataSource.setTestQuery(dBConfig2.getTestQuery());
        return xaDataSource;
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
