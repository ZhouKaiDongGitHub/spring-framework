package com.luban.service;

import com.luban.dao.OrderDao;
import com.luban.dao.OrderDaoImplA;
import com.luban.dao.OrderDaoImplB;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class OrderService  implements ApplicationContextAware {

    ApplicationContext context;

    //@Autowired
    //OrderDao orderDao;

    @Autowired
    Map<String,OrderDao> map;

    public void query(String userType){
        if(userType.equals("A")){
            ((OrderDao)context.getBean("orderDaoImplA")).update("AAAAAAA");
        }else if(userType.equals("B")){
            ((OrderDao)context.getBean("orderDaoImplB")).update("BBBBBB");
        }
        //orderDao.update(userType);
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }
}
