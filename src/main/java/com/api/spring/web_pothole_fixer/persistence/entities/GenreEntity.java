package com.api.spring.web_pothole_fixer.persistence.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "genres")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class GenreEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long Id;
    @Column(nullable = false, length = 15)
    private String genre;

    @OneToMany
    private List<EmployeeEntity> employees;
}
