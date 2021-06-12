package br.unicamp.mc851.evisita.oapisrvpacientes.controller;

import br.unicamp.mc851.evisita.oapisrvpacientes.controller.dto.PatientRequest;
import br.unicamp.mc851.evisita.oapisrvpacientes.controller.dto.PatientResponse;
import br.unicamp.mc851.evisita.oapisrvpacientes.usecase.GetPatientsResponse;
import br.unicamp.mc851.evisita.oapisrvpacientes.usecase.SavePatientRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "patients/v1", produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class PatientsController {
    private final SavePatientRequest savePatientRequest;
    private final GetPatientsResponse getPatientsResponse;

    @PostMapping(value = "/patient", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PatientResponse> savePatient(@RequestBody PatientRequest patientRequest) {
        return ResponseEntity.status(HttpStatus.CREATED).body(savePatientRequest.execute(patientRequest));
    }

    @GetMapping("/patients")
    public ResponseEntity<List<PatientResponse>> getPatients() {
        return ResponseEntity.status(HttpStatus.OK).body(getPatientsResponse.execute());
    }
}
