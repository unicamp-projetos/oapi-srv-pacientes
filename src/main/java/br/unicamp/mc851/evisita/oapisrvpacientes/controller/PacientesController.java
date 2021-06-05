package br.unicamp.mc851.evisita.oapisrvpacientes.controller;

import br.unicamp.mc851.evisita.oapisrvpacientes.controller.dto.PacienteRequest;
import br.unicamp.mc851.evisita.oapisrvpacientes.controller.dto.PacienteResponse;
import br.unicamp.mc851.evisita.oapisrvpacientes.usecase.GetPacientesResponse;
import br.unicamp.mc851.evisita.oapisrvpacientes.usecase.SavePacienteRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "pacientes/v1", produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class PacientesController {
    private final SavePacienteRequest savePacienteRequest;
    private final GetPacientesResponse getPacientesResponse;

    @PostMapping(value = "/paciente", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PacienteResponse> savePaciente(@RequestBody PacienteRequest pacienteRequest) {
        return ResponseEntity.status(HttpStatus.CREATED).body(savePacienteRequest.execute(pacienteRequest));
    }

    @GetMapping("/pacientes")
    public ResponseEntity<List<PacienteResponse>> getPacientes() {
        return ResponseEntity.status(HttpStatus.OK).body(getPacientesResponse.execute());
    }
}
