package br.unicamp.mc851.evisita.oapisrvpacientes.controller;

import br.unicamp.mc851.evisita.oapisrvpacientes.controller.dto.PatientRequest;
import br.unicamp.mc851.evisita.oapisrvpacientes.controller.dto.PatientResponse;
import br.unicamp.mc851.evisita.oapisrvpacientes.usecase.GetPatientByMedicalRecord;
import br.unicamp.mc851.evisita.oapisrvpacientes.usecase.GetPatientsResponse;
import br.unicamp.mc851.evisita.oapisrvpacientes.usecase.SavePatientRequest;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
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
    private final GetPatientByMedicalRecord getPatientByMedicalRecord;

    @PostMapping(value = "/patient", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation("Save patient in database")
    @ApiResponse(code = 201, message = "Patient saved in database")
    public ResponseEntity<PatientResponse> savePatient(@RequestBody PatientRequest patientRequest) {
        return ResponseEntity.status(HttpStatus.CREATED).body(savePatientRequest.execute(patientRequest));
    }

    @GetMapping("/patients")
    @ApiOperation("Retrieve all patients in database")
    @ApiResponse(code = 200, message = "Retrieve all patients")
    public ResponseEntity<List<PatientResponse>> getPatients() {
        return ResponseEntity.status(HttpStatus.OK).body(getPatientsResponse.execute());
    }

    @GetMapping("/patient/{medicalRecord}")
    @ApiOperation("Retrieve a patient given the medicalRecord")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Patient retrieved successfully"),
            @ApiResponse(code = 204, message = "No patient found")
    })
    public ResponseEntity<PatientResponse> getPatientByMedicalRecord(@PathVariable String medicalRecord) {
        var patientResponse = getPatientByMedicalRecord.execute(medicalRecord);
        return patientResponse != null ?
                ResponseEntity.ok(patientResponse) : ResponseEntity.notFound().build();
    }
}
