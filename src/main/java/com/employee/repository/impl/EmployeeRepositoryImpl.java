package com.employee.repository.impl;

import com.employee.model.Employee;
import com.employee.repository.EmployeeRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {

    @Override
    public List<Employee> getAll() {
        return null;
    }

    @Override
    public Employee getOne(Integer employeeId) {
        return null;
    }

    @Override
    public Employee save() {
        return null;
    }
}
