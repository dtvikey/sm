package com.imooc.sm.service;

import com.imooc.sm.entity.Department;

import java.util.List;

/**
 * @Author: dtvikey
 * @Date: 08/12/18 上午 10:53
 * @Version 1.0
 */
public interface DepartmentService {
    void add(Department department);
    void remove(Integer id);
    void edit(Department department);
    Department get(Integer id);
    List<Department> getAll();
}
