package br.unicamp.mc851.evisita.oapisrvpacientes.database.impl;

import br.unicamp.mc851.evisita.oapisrvpacientes.adapter.PatientAdapter;
import br.unicamp.mc851.evisita.oapisrvpacientes.database.GetPatients;
import br.unicamp.mc851.evisita.oapisrvpacientes.database.repository.PatientRepository;
import br.unicamp.mc851.evisita.oapisrvpacientes.domain.Patient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class GetPatientsImpl implements GetPatients {
    private final PatientRepository repository;
    @Override
    public List<Patient> execute() {
        return repository.findAll()
                .stream()
                .map(PatientAdapter::convert)
                .collect(Collectors.toList());
    }
}
