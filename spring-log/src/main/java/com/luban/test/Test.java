package com.luban.test;

import com.luban.config.AppConfig;
//import org.apache.log4j.Logger;
import com.luban.service.IndexServiceImpl;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test  {
    //private static Logger logger = Logger.getLogger(Log4jTest.class);
    //private static Logger logger = LoggerFactory.getLogger(Test.class.getName());
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        context.start();
        //IndexServiceImpl indexService = context.getBean(IndexServiceImpl.class);
       // indexService.query();
        //logger.info("user:slf4j");
    }

}
