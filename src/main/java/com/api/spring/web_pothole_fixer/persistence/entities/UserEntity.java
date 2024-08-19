package com.api.spring.web_pothole_fixer.persistence.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(nullable = false , length = 20)
    private String username;
    @Column(nullable = false, length = 25)
    private String password;
    @Column(nullable = false, length = 20)
    private String privilege;

    @OneToOne
    private EmployeeEntity employee;
}
