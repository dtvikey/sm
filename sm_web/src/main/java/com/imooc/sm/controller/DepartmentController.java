package com.imooc.sm.controller;

import com.imooc.sm.entity.Department;
import com.imooc.sm.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @Author: dtvikey
 * @Date: 08/12/18 上午 11:01
 * @Version 1.0
 */
@Controller("departmentController")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    // /department/list.do   /department_list.jsp
    public void list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Department> list = departmentService.getAll();
        request.setAttribute("LIST",list);
        request.getRequestDispatcher("../department_list.jsp").forward(request,response);


    }

    public void toAdd(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("../department_add.jsp").forward(request,response);

    }

}
