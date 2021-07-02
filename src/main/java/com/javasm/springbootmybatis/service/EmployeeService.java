package com.javasm.springbootmybatis.service;

import com.javasm.springbootmybatis.entity.Employee;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author jhh
 * @since 2021-06-29
 */
public interface EmployeeService {

    List<Employee> findAll();
}
