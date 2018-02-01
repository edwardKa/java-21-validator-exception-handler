package com.employee.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;

import java.util.Arrays;

@AllArgsConstructor
public enum EmployeeType {

    CREW_MEMBER(1),
    TEAM_LEADER(2),
    GROUP_LEADER(3),
    PROJECT_MANAGER(4),
    VP_RND(5),
    VP(6),
    CEO(7)
    ;

    private Integer id;

    @JsonValue
    public Integer getId() {
        return id;
    }

    @JsonCreator
    public static EmployeeType getById(Integer id) {
        for (EmployeeType employeeType : values()) {
            if (employeeType.getId().equals(id)) {
                return employeeType;
            }
        }

        return null;
    }
}

//todo remove this
class A {
    @SneakyThrows
    public static void main(String[] args) {
        String json = new ObjectMapper()
                .writeValueAsString(EmployeeType.VP);

        System.out.println(json);

        System.out.println(EmployeeType.VP.ordinal());
        System.out.println(EmployeeType.VP.name());
        System.out.println(Arrays.toString(EmployeeType.values()));


        System.out.println(new ObjectMapper()
        .readValue(json, EmployeeType.class));
    }
}
