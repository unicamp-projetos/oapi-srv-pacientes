package br.unicamp.mc851.evisita.oapisrvpacientes.database.impl;

import br.unicamp.mc851.evisita.oapisrvpacientes.adapter.PacienteModelToPaciente;
import br.unicamp.mc851.evisita.oapisrvpacientes.adapter.PacienteToPacienteModel;
import br.unicamp.mc851.evisita.oapisrvpacientes.database.SavePaciente;
import br.unicamp.mc851.evisita.oapisrvpacientes.database.repository.PacienteRepository;
import br.unicamp.mc851.evisita.oapisrvpacientes.domain.Paciente;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SavePacienteImpl implements SavePaciente {
    private final PacienteRepository repository;

    @Override
    public Paciente execute(Paciente paciente) {
        var pacienteModel = repository.save(PacienteToPacienteModel.convert(paciente));
        return PacienteModelToPaciente.convert(pacienteModel);
    }
}
