package br.unicamp.mc851.evisita.oapisrvpacientes.adapter;

import br.unicamp.mc851.evisita.oapisrvpacientes.database.entity.PacienteModel;
import br.unicamp.mc851.evisita.oapisrvpacientes.domain.Paciente;

import java.time.LocalDateTime;

public class PacienteToPacienteModel {
    private PacienteToPacienteModel() {}
    public static PacienteModel convert(Paciente paciente) {
        return PacienteModel.builder()
                .prontuario(paciente.getProntuario())
                .cpf(paciente.getCpf())
                .nome(paciente.getNome())
                .nomeMae(paciente.getNomeMae())
                .nomePai(paciente.getNomePai())
                .rg(paciente.getRg())
                .nroCartaoSaude(paciente.getNroCartaoSaude())
                .dataRegistro(LocalDateTime.now())
                .dataAtualizacao(LocalDateTime.now())
                .idMedico(paciente.getIdMedico())
                .build();
    }
}
