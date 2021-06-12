package br.unicamp.mc851.evisita.oapisrvpacientes.usecase;

import br.unicamp.mc851.evisita.oapisrvpacientes.controller.dto.PatientRequest;
import br.unicamp.mc851.evisita.oapisrvpacientes.controller.dto.PatientResponse;

public interface SavePatientRequest {
    PatientResponse execute(PatientRequest patientRequest);
}
