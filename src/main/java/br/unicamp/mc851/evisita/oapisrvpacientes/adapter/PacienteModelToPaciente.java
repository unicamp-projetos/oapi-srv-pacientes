package br.unicamp.mc851.evisita.oapisrvpacientes.adapter;

import br.unicamp.mc851.evisita.oapisrvpacientes.database.entity.PacienteModel;
import br.unicamp.mc851.evisita.oapisrvpacientes.domain.Paciente;

public class PacienteModelToPaciente {
    private PacienteModelToPaciente() {}
    public static Paciente convert(PacienteModel model) {
        return Paciente.builder()
                .nome(model.getNome())
                .nomeMae(model.getNomeMae())
                .nomePai(model.getNomePai())
                .cpf(model.getCpf())
                .rg(model.getRg())
                .prontuario(model.getProntuario())
                .nroCartaoSaude(model.getNroCartaoSaude())
                .idMedico(model.getIdMedico())
                .build();
    }
}
