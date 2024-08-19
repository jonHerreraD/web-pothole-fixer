package com.api.spring.web_pothole_fixer.persistence.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "teams")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TeamEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(nullable = false, length = 20)
    private String name;

    @OneToMany
    private List<EmployeeEntity> employees;
    @OneToMany
    private List<ReportEntity> reports;
}
