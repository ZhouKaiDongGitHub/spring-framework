package com.luban.config;

import org.apache.ibatis.logging.log4j.Log4jImpl;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;


@Configuration
@ComponentScan("com.luban")
@MapperScan("com.luban.dao")
public class AppConfig {

    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setPassword("11111");
        driverManagerDataSource.setUsername("root");
        driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/test_db");
        driverManagerDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        return  driverManagerDataSource;
    }

    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource){
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration();
        /**
         * spring4 日志 采用原生的jcl log4j>jul
         * spring5 日志 采用改版的jcl log4j2>slf4j>jul
         * mybatis 日志 采用自己的日志 slf4j>jcl>log4j2>log4j>jul
         *
         * spring5 + mybatis + log4j 只会打印spring日志，不打印mybatis日志，什么原因？
         *  1.spring5的日志体系自带jcl，而且在没有 log4j2>slf4j 情况下，采用的是jul;
         *  2.mybatis发现没有slf4j但是有jcl，就会去执行spring的jcl,然后采用了jul;
         *  3.但是jul的级别是info,而mybatis打印SQL的级别是debug,所以不打印
         * 如果非要打印呢？
         * 1. 采用slf4j+slf4j-log4j，强行让两者都打印log4j
         * 2. 扩展mybatis的日志
         *
         */
        configuration.setLogImpl(Log4jImpl.class);
        sqlSessionFactoryBean.setConfiguration(configuration);
        return sqlSessionFactoryBean;
    }

}
