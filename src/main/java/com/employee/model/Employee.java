package com.employee.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee {

    private Integer id;

    @NotBlank(message = "First name cannot be blank")
    @Length(
            min = 3,
            max = 20,
            message = "Length must be between 3 and 20")
    private String firstName;

    @NotBlank(message = "Last name cannot be blank")
    @Length(
            min = 3,
            max = 20,
            message = "Length must be between 3 and 20")
    private String lastName;

//    @Min(value = 1, message = "Employee type cannot be less than 0")
//    @Max(value = 7, message = "Employee type cannot be greater than 7")
    private EmployeeType employeeType;
}
