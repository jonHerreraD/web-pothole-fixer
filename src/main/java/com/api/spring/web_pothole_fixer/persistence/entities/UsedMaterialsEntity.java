package com.api.spring.web_pothole_fixer.persistence.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "usedMaterials")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UsedMaterialsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long Id;

    @ManyToOne
    private ReportEntity report;
    @ManyToOne
    private MaterialEntity material;
}
