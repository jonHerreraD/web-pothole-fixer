package com.api.spring.web_pothole_fixer.persistence.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "reports")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ReportEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(nullable = true, length = 80)
    private String observations;
    @Column(nullable = false)
    private LocalDateTime startDate;
    @Column(nullable = false)
    private LocalDateTime endDate;

    @OneToOne
    private CitizenReportEntity citizenReport;
    @ManyToOne
    private StatusEntity status;
    @ManyToOne
    private TeamEntity team;
    @ManyToOne
    private EmployeeEntity employee;
    @ManyToOne
    private StreetEntity street;
    @ManyToOne
    private StreetEntity streetBetween1;
    @ManyToOne
    private StreetEntity streetBetween2;
    @OneToMany
    private List<UsedMaterialsEntity> usedMaterials;




}
