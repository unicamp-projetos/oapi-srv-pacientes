package br.unicamp.mc851.evisita.oapisrvpacientes.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Patient {
    private String medicalRecord;
    private String name;
    private String rg;
    private String cpf;
    private String motherName;
    private String fatherName;
    private String susCardNumber;
    private String doctor;
    private String functionalUnit;
    private String bed;
    private String room;
}
