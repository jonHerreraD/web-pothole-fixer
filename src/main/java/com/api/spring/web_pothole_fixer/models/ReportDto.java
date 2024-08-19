package com.api.spring.web_pothole_fixer.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ReportDto {
    private Long id;
    private String observations;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private Long citizenReportId;
    private Long statusId;
    private Long employeeId;
    private Long teamId;
    private Long streetId;
    private Long colonyId;
    private Long streetBetweenId1; // Primer cruce de calle
    private Long streetBetweenId2; // Segundo cruce de calle
}
