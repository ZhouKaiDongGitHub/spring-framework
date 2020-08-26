package com.luban.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class BeanPostProcessorM implements BeanPostProcessor {


    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if("indexService".equals(beanName)){
            System.out.println(((IndexService) bean).getOrderDaoImplA());
            System.out.println("postProcessBeforeInitialization");
            System.out.println(((IndexService) bean).getOrderDaoImplA());
        }
        return bean;
    }


    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if("indexService".equals(beanName)){
            System.out.println(((IndexService) bean).getOrderDaoImplA());
            System.out.println("postProcessAfterInitialization");
            System.out.println(((IndexService) bean).getOrderDaoImplA());
        }
        return bean;
    }
}
