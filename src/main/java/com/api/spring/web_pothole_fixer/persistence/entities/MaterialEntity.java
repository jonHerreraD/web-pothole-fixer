package com.api.spring.web_pothole_fixer.persistence.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "materials")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MaterialEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(nullable = false, length = 25)
    private String name;
    @OneToMany
    private List<UsedMaterialsEntity> usedMaterials;
}
