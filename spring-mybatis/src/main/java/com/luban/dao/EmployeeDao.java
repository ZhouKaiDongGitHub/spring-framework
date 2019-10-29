package com.luban.dao;

import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface EmployeeDao {

    @Select("SELECT * FROM tb_emp1;")
    public List<Map<String,Object>> list();
}
