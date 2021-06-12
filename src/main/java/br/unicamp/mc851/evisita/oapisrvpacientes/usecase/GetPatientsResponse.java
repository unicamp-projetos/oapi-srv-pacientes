package br.unicamp.mc851.evisita.oapisrvpacientes.usecase;

import br.unicamp.mc851.evisita.oapisrvpacientes.controller.dto.PatientResponse;

import java.util.List;

public interface GetPatientsResponse {
    List<PatientResponse> execute();
}
