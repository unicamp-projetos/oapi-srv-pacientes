package br.unicamp.mc851.evisita.oapisrvpacientes.adapter;

import br.unicamp.mc851.evisita.oapisrvpacientes.database.entity.PatientModel;
import br.unicamp.mc851.evisita.oapisrvpacientes.domain.Patient;

public class PatientModelToPatient {
    private PatientModelToPatient() {}
    public static Patient convert(PatientModel model) {
        return Patient.builder()
                .name(model.getName())
                .motherName(model.getMotherName())
                .fatherName(model.getFatherName())
                .cpf(model.getCpf())
                .rg(model.getRg())
                .medicalRecord(model.getMedicalRecord())
                .susCardNumber(model.getSusCardNumber())
                .doctorId(model.getDoctorId())
                .build();
    }
}
