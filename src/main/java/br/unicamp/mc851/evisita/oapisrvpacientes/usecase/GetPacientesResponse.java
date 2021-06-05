package br.unicamp.mc851.evisita.oapisrvpacientes.usecase;

import br.unicamp.mc851.evisita.oapisrvpacientes.controller.dto.PacienteResponse;

import java.util.List;

public interface GetPacientesResponse {
    List<PacienteResponse> execute();
}
