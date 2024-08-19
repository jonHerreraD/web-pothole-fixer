package com.api.spring.web_pothole_fixer.persistence.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "employees")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(nullable = false, length = 20)
    private String name;
    @Column(nullable = false, length = 20)
    private String lastName;
    @Column(nullable = false, length = 35)
    private String email;
    @Column(nullable = false, length = 25)
    private String phoneNumber;

    @ManyToOne
    private GenreEntity genre;
    @ManyToOne
    private TeamEntity team;
    @OneToOne
    private UserEntity user;
    @OneToMany
    private List<ReportEntity> reports;
}
