package com.api.spring.web_pothole_fixer.persistence.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "streets")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class StreetEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(nullable = false ,length = 40)
    private String name;

    @ManyToOne
    private ColonyEntity colony;
    @OneToMany
    private List<ReportEntity> reports;
}
