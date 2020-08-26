package com.luban.dao;


import org.springframework.stereotype.Component;

@Component
public class OrderDaoImplB implements OrderDao {

    public void update(String sql) {
        System.out.println(sql);
    }
}
