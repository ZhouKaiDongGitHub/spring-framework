package com.luban.dao;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public class OrderDaoImpl implements OrderDao {

    public void update(String sql) {
        System.out.println(sql);
    }
}
