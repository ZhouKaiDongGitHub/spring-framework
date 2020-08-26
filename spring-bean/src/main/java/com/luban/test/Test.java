package com.luban.test;

import com.luban.AppConfig;
import com.luban.dao.OrderDao;
import com.luban.service.OrderService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();
        //context.getBean(OrderService.class).query("A");
        //context.getBean(OrderService.class).query("B");
    }
}
