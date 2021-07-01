package br.unicamp.mc851.evisita.oapisrvpacientes.database.impl;

import br.unicamp.mc851.evisita.oapisrvpacientes.adapter.PatientAdapter;
import br.unicamp.mc851.evisita.oapisrvpacientes.adapter.PatientModelAdapter;
import br.unicamp.mc851.evisita.oapisrvpacientes.database.SavePatient;
import br.unicamp.mc851.evisita.oapisrvpacientes.database.repository.PatientRepository;
import br.unicamp.mc851.evisita.oapisrvpacientes.domain.Patient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SavePatientImpl implements SavePatient {
    private final PatientRepository repository;

    @Override
    public Patient execute(Patient patient) {
        var pacienteModel = repository.save(PatientModelAdapter.convert(patient));
        return PatientAdapter.convert(pacienteModel);
    }
}
