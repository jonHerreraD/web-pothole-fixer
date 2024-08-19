package com.api.spring.web_pothole_fixer.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDto {

    private Long id;
    private String username;
    private String password;
    private String role;
    private EmployeeDto employee;

}
