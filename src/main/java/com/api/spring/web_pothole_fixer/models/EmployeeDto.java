package com.api.spring.web_pothole_fixer.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmployeeDto {

    private Long id;
    private String name;
    private String lastName;
    private String email;
    private String phoneNumber;
    private Long genreId;
    private Long teamId;
}
