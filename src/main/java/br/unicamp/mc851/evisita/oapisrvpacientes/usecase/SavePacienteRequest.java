package br.unicamp.mc851.evisita.oapisrvpacientes.usecase;

import br.unicamp.mc851.evisita.oapisrvpacientes.controller.dto.PacienteRequest;
import br.unicamp.mc851.evisita.oapisrvpacientes.controller.dto.PacienteResponse;

public interface SavePacienteRequest {
    PacienteResponse execute(PacienteRequest pacienteRequest);
}
