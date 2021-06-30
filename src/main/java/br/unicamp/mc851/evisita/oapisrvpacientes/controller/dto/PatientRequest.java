package br.unicamp.mc851.evisita.oapisrvpacientes.controller.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class PatientRequest {
    @NonNull
    private String medicalRecord;
    @NonNull
    private String name;
    private String motherName;
    private String fatherName;
    @NonNull
    private String cpf;
    private String rg;
    private String susCardNumber;
    private @NonNull String doctor;
    private String bed;
    private String room;
    private String functionalUnit;
}
