package com.luban.service;

import com.luban.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class EmployeeService {

    @Autowired
    EmployeeDao employeeDao;
    public List<Map<String,Object>> list(){
        return employeeDao.list();
    }
}
