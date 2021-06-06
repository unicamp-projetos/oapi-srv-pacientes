package br.unicamp.mc851.evisita.oapisrvpacientes.adapter;

import br.unicamp.mc851.evisita.oapisrvpacientes.controller.dto.PacienteRequest;
import br.unicamp.mc851.evisita.oapisrvpacientes.domain.Paciente;

public class PacienteRequestToPaciente {
    private PacienteRequestToPaciente() {}

    public static Paciente convert(PacienteRequest request) {
        return Paciente.builder()
                .prontuario(request.getProntuario())
                .nome(request.getNome())
                .nomePai(request.getNomePai())
                .nomeMae(request.getNomeMae())
                .nroCartaoSaude(request.getNroCartaoSaude())
                .rg(request.getRg())
                .cpf(request.getCpf())
                .idMedico(request.getIdMedico())
                .build();
    }
}
