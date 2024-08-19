package com.api.spring.web_pothole_fixer.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UsedMaterialDto {
    private Long materialId;
    private Long reportId;
}

