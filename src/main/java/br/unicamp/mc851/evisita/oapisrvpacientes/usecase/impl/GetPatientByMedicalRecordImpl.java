package br.unicamp.mc851.evisita.oapisrvpacientes.usecase.impl;

import br.unicamp.mc851.evisita.oapisrvpacientes.adapter.PatientResponseAdapter;
import br.unicamp.mc851.evisita.oapisrvpacientes.controller.dto.PatientResponse;
import br.unicamp.mc851.evisita.oapisrvpacientes.database.repository.PatientRepository;
import br.unicamp.mc851.evisita.oapisrvpacientes.usecase.GetPatientByMedicalRecord;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GetPatientByMedicalRecordImpl implements GetPatientByMedicalRecord {

    private final PatientRepository repository;

    @Override
    public PatientResponse execute(String medicalRecord) {
        var modelOptional = repository.findById(medicalRecord);

        if (modelOptional.isEmpty()) {
            return null;
        }

        return PatientResponseAdapter.convert(modelOptional.get());
    }
}
