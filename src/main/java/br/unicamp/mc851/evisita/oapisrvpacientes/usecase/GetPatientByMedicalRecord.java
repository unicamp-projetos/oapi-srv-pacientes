package br.unicamp.mc851.evisita.oapisrvpacientes.usecase;

import br.unicamp.mc851.evisita.oapisrvpacientes.controller.dto.PatientResponse;

public interface GetPatientByMedicalRecord {
    PatientResponse execute(String medicalRecord);
}
