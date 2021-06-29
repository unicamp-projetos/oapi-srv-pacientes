package br.unicamp.mc851.evisita.oapisrvpacientes.adapter;

import br.unicamp.mc851.evisita.oapisrvpacientes.database.entity.PatientModel;
import br.unicamp.mc851.evisita.oapisrvpacientes.domain.Patient;
import lombok.experimental.UtilityClass;

import java.time.LocalDateTime;

@UtilityClass
public class PatientModelAdapter {

    public static PatientModel convert(Patient patient) {
        return PatientModel.builder()
                .medicalRecord(patient.getMedicalRecord())
                .cpf(patient.getCpf())
                .name(patient.getName())
                .motherName(patient.getMotherName())
                .fatherName(patient.getFatherName())
                .rg(patient.getRg())
                .susCardNumber(patient.getSusCardNumber())
                .recordDate(LocalDateTime.now())
                .updateDate(LocalDateTime.now())
                .doctor(patient.getDoctor())
                .bed(patient.getBed())
                .room(patient.getRoom())
                .functionalUnit(patient.getFunctionalUnit())
                .build();
    }
}
