package br.unicamp.mc851.evisita.oapisrvpacientes.usecase.impl;

import br.unicamp.mc851.evisita.oapisrvpacientes.adapter.PacienteToPacienteResponse;
import br.unicamp.mc851.evisita.oapisrvpacientes.controller.dto.PacienteResponse;
import br.unicamp.mc851.evisita.oapisrvpacientes.database.GetPacientes;
import br.unicamp.mc851.evisita.oapisrvpacientes.usecase.GetPacientesResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class GetPacientesResponseImpl implements GetPacientesResponse {
    private final GetPacientes getPacientes;
    @Override
    public List<PacienteResponse> execute() {
        return getPacientes.execute()
                .stream()
                .map(PacienteToPacienteResponse::convert)
                .collect(Collectors.toList());
    }
}
