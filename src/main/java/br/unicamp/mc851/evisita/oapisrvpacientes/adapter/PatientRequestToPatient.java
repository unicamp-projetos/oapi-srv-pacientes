package br.unicamp.mc851.evisita.oapisrvpacientes.adapter;

import br.unicamp.mc851.evisita.oapisrvpacientes.controller.dto.PatientRequest;
import br.unicamp.mc851.evisita.oapisrvpacientes.domain.Patient;

public class PatientRequestToPatient {

    private PatientRequestToPatient() {}

    public static Patient convert(PatientRequest request) {
        return Patient.builder()
                .medicalRecord(request.getMedicalRecord())
                .name(request.getName())
                .fatherName(request.getFatherName())
                .motherName(request.getMotherName())
                .susCardNumber(request.getSusCardNumber())
                .rg(request.getRg())
                .cpf(request.getCpf())
                .doctorId(request.getDoctorId())
                .build();
    }
}
