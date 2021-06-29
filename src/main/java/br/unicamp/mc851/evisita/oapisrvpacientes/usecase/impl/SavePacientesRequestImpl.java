package br.unicamp.mc851.evisita.oapisrvpacientes.usecase.impl;

import br.unicamp.mc851.evisita.oapisrvpacientes.adapter.PatientAdapter;
import br.unicamp.mc851.evisita.oapisrvpacientes.adapter.PatientResponseAdapter;
import br.unicamp.mc851.evisita.oapisrvpacientes.controller.dto.PatientRequest;
import br.unicamp.mc851.evisita.oapisrvpacientes.controller.dto.PatientResponse;
import br.unicamp.mc851.evisita.oapisrvpacientes.database.SavePatient;
import br.unicamp.mc851.evisita.oapisrvpacientes.usecase.SavePatientRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SavePacientesRequestImpl implements SavePatientRequest {
    private final SavePatient savePatient;
    @Override
    public PatientResponse execute(PatientRequest patientRequest) {
        var paciente = savePatient.execute(PatientAdapter.convert(patientRequest));
        return PatientResponseAdapter.convert(paciente);
    }
}
