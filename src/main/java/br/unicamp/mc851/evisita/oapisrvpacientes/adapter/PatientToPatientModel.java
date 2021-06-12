package br.unicamp.mc851.evisita.oapisrvpacientes.adapter;

import br.unicamp.mc851.evisita.oapisrvpacientes.database.entity.PatientModel;
import br.unicamp.mc851.evisita.oapisrvpacientes.domain.Patient;

import java.time.LocalDateTime;

public class PatientToPatientModel {
    private PatientToPatientModel() {}
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
                .doctorId(patient.getDoctorId())
                .build();
    }
}
