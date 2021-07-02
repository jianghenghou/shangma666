package com.javasm.springbootmybatis.controller;

import com.javasm.springbootmybatis.entity.Employee;
import com.javasm.springbootmybatis.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author：JiangHengHou
 * @Version：1.0
 * @Date：2021/6/30-19:41
 * @Since:jdk1.8
 * @Description:TODO
 */
@RestController
@RequestMapping("employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("findAll")
    public List<Employee> findAll() {
        return employeeService.findAll();
    }
}
