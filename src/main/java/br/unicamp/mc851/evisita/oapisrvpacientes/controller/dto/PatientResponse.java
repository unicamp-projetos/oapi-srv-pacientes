package br.unicamp.mc851.evisita.oapisrvpacientes.controller.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PatientResponse {
    private String medicalRecord;
    private String name;
    private String cpf;
    private String rg;
    private String doctor;
    private String bed;
    private String functionalUnit;
    private String room;
}
