package br.unicamp.mc851.evisita.oapisrvpacientes.controller.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class PatientRequest {
    @NonNull
    private Long medicalRecord;
    @NonNull
    private String name;
    private String motherName;
    private String fatherName;
    @NonNull
    private Long cpf;
    private String rg;
    private Long susCardNumber;
    @NonNull
    private Long doctorId;
}
