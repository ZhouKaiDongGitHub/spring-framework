package com.luban;

import com.luban.config.AppConfig;
import com.luban.service.EmployeeService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println(context.getBean(EmployeeService.class).list());
    }
}
