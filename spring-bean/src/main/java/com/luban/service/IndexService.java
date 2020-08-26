package com.luban.service;

import com.luban.dao.OrderDao;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

@Service
public class IndexService implements InitializingBean {


    //1, finishBeanFactoryInitialing()
        // 1.1 newInstance
        // 1.2 populateBean
        // 1.3 beanPostProcessor

    @Value("kzhou")
    private String name;
    @Autowired
    private OrderDao orderDaoImplA;

    public  IndexService(){
        System.out.println("无参构造");
    }

    public IndexService(String name) {
        this.name = name;
        System.out.println("有参构造");
    }

    @PostConstruct
    public void test(){
        System.out.println(orderDaoImplA);
        System.out.println("@PostConstruct");
        System.out.println(orderDaoImplA);
    }

    public String getName() {
        return name;
    }
    //@Required  //必须在xml文件中配置
    public void setName(String name) {
        this.name = name;
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println(orderDaoImplA);
        System.out.println("InitializingBean");
        System.out.println(orderDaoImplA);
    }

    public OrderDao getOrderDaoImplA() {
        return orderDaoImplA;
    }

    public void setOrderDaoImplA(OrderDao orderDaoImplA) {
        this.orderDaoImplA = orderDaoImplA;
    }


}
