package br.unicamp.mc851.evisita.oapisrvpacientes.usecase.impl;

import br.unicamp.mc851.evisita.oapisrvpacientes.adapter.PacienteRequestToPaciente;
import br.unicamp.mc851.evisita.oapisrvpacientes.adapter.PacienteToPacienteResponse;
import br.unicamp.mc851.evisita.oapisrvpacientes.controller.dto.PacienteRequest;
import br.unicamp.mc851.evisita.oapisrvpacientes.controller.dto.PacienteResponse;
import br.unicamp.mc851.evisita.oapisrvpacientes.database.SavePaciente;
import br.unicamp.mc851.evisita.oapisrvpacientes.usecase.SavePacienteRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SavePacientesRequestImpl implements SavePacienteRequest {
    private final SavePaciente savePaciente;
    @Override
    public PacienteResponse execute(PacienteRequest pacienteRequest) {
        var paciente = savePaciente.execute(PacienteRequestToPaciente.convert(pacienteRequest));
        return PacienteToPacienteResponse.convert(paciente);
    }
}
