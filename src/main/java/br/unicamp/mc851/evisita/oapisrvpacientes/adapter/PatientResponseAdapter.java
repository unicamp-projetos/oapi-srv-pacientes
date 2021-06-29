package br.unicamp.mc851.evisita.oapisrvpacientes.adapter;

import br.unicamp.mc851.evisita.oapisrvpacientes.controller.dto.PatientResponse;
import br.unicamp.mc851.evisita.oapisrvpacientes.domain.Patient;
import lombok.experimental.UtilityClass;

@UtilityClass
public class PatientResponseAdapter {

    public static PatientResponse convert(Patient patient) {
        return PatientResponse.builder()
                .medicalRecord(patient.getMedicalRecord())
                .name(patient.getName())
                .cpf(patient.getCpf())
                .rg(patient.getRg())
                .doctor(patient.getDoctor())
                .build();
    }
}
