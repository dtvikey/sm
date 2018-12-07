package com.imooc.sm.dao;

import com.imooc.sm.entity.Department;

import java.util.List;

/**
 * @Author: dtvikey
 * @Date: 07/12/18 下午 03:11
 * @Version 1.0
 */
public interface DepartmentDao {

    void insert(Department department);
    void delete(Integer id);
    void update(Department department);
    Department selectById(Integer id);
    List<Department> selectAll();

}
