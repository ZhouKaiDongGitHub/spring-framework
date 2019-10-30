package com.luban;

import com.luban.config.AppConfig;
import com.luban.dao.EmployeeDao;
import com.luban.service.EmployeeService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.logging.log4j.Log4jImpl;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;
import java.io.InputStream;

public class Test {

    public static void main(String[] args) {
        /*AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println(context.getBean(EmployeeService.class).list());*/

        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        sqlSessionFactory.getConfiguration().addMapper(EmployeeDao.class);
        sqlSessionFactory.getConfiguration().setLogImpl(Log4jImpl.class);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        EmployeeDao employeeDao = sqlSession.getMapper(EmployeeDao.class);
        System.out.println(employeeDao.list());
    }
}
