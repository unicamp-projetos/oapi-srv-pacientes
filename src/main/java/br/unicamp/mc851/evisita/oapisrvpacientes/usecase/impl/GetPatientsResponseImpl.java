package br.unicamp.mc851.evisita.oapisrvpacientes.usecase.impl;

import br.unicamp.mc851.evisita.oapisrvpacientes.adapter.PatientToPatientResponse;
import br.unicamp.mc851.evisita.oapisrvpacientes.controller.dto.PatientResponse;
import br.unicamp.mc851.evisita.oapisrvpacientes.database.GetPatients;
import br.unicamp.mc851.evisita.oapisrvpacientes.usecase.GetPatientsResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class GetPatientsResponseImpl implements GetPatientsResponse {
    private final GetPatients getPatients;
    @Override
    public List<PatientResponse> execute() {
        return getPatients.execute()
                .stream()
                .map(PatientToPatientResponse::convert)
                .collect(Collectors.toList());
    }
}
