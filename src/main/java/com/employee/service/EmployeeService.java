package com.employee.service;

import com.employee.model.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAll();
    Employee getOne(Integer employeeId);
    Employee save();
}
