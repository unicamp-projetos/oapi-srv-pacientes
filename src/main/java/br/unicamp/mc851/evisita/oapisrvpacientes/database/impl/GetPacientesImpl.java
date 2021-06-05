package br.unicamp.mc851.evisita.oapisrvpacientes.database.impl;

import br.unicamp.mc851.evisita.oapisrvpacientes.adapter.PacienteModelToPaciente;
import br.unicamp.mc851.evisita.oapisrvpacientes.database.GetPacientes;
import br.unicamp.mc851.evisita.oapisrvpacientes.database.repository.PacienteRepository;
import br.unicamp.mc851.evisita.oapisrvpacientes.domain.Paciente;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class GetPacientesImpl implements GetPacientes {
    private final PacienteRepository repository;
    @Override
    public List<Paciente> execute() {
        return repository.findAll()
                .stream()
                .map(PacienteModelToPaciente::convert)
                .collect(Collectors.toList());
    }
}
