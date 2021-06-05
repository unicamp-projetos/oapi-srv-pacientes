package br.unicamp.mc851.evisita.oapisrvpacientes.adapter;

import br.unicamp.mc851.evisita.oapisrvpacientes.controller.dto.PacienteResponse;
import br.unicamp.mc851.evisita.oapisrvpacientes.domain.Paciente;

public class PacienteToPacienteResponse {
    private PacienteToPacienteResponse() {}

    public static PacienteResponse convert(Paciente paciente) {
        return PacienteResponse.builder()
                .prontuario(paciente.getProntuario())
                .nome(paciente.getNome())
                .cpf(paciente.getCpf())
                .rg(paciente.getRg())
                .idMedico(paciente.getIdMedico())
                .build();
    }
}
