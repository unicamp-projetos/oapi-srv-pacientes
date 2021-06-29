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
    private Long medicalRecord;
    private String name;
    private String rg;
    private Long cpf;
    private String motherName;
    private String fatherName;
    private Long susCardNumber;
    private String doctor;
    private String functionalUnit;
    private String bed;
    private String room;
}
