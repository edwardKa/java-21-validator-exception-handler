package com.employee.controller;

import com.employee.exception.InputValidationException;
import com.employee.model.Employee;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @PostMapping("/save")
    public Employee save(
            @RequestBody @Valid Employee employee,
            BindingResult result) {
        if (result.hasErrors()) {
            System.out.println("Has errors");
            System.out.println(result.getFieldErrors().toString());
//            throw new RuntimeException(result.getFieldErrors().toString());
            throw new InputValidationException(result);
        }
        return employee;
    }



    @GetMapping("/get/{employeeId}")
    public Employee getOne(
            @PathVariable("employeeId") Integer employeeId) {
        return null;
    }

    @GetMapping("/get")
    public List<Employee> getAll() {
        return null;
    }
}
