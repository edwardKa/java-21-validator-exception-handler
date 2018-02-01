package com.employee.repository;

import com.employee.model.Employee;

import java.util.List;

public interface EmployeeRepository {

    List<Employee> getAll();
    Employee getOne(Integer employeeId);
    Employee save();
}
