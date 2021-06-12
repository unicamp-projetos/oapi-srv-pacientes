package br.unicamp.mc851.evisita.oapisrvpacientes.database.impl;

import br.unicamp.mc851.evisita.oapisrvpacientes.adapter.PatientModelToPatient;
import br.unicamp.mc851.evisita.oapisrvpacientes.adapter.PatientToPatientModel;
import br.unicamp.mc851.evisita.oapisrvpacientes.database.SavePatient;
import br.unicamp.mc851.evisita.oapisrvpacientes.database.repository.PacienteRepository;
import br.unicamp.mc851.evisita.oapisrvpacientes.domain.Patient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SavePatientImpl implements SavePatient {
    private final PacienteRepository repository;

    @Override
    public Patient execute(Patient patient) {
        var pacienteModel = repository.save(PatientToPatientModel.convert(patient));
        return PatientModelToPatient.convert(pacienteModel);
    }
}
