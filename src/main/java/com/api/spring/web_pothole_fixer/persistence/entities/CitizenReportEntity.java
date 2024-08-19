package com.api.spring.web_pothole_fixer.persistence.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "citizenReports")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CitizenReportEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(nullable = false, length = 40)
    private String street;
    @Column(nullable = false, length = 40)
    private String colony;
    @Column(nullable = false, length = 25)
    private String email;
    @Column(nullable = false)
    private LocalDateTime date;

    @OneToOne
    private ReportEntity report;
}
