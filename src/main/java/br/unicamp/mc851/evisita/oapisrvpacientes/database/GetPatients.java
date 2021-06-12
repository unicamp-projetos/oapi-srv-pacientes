package br.unicamp.mc851.evisita.oapisrvpacientes.database;

import br.unicamp.mc851.evisita.oapisrvpacientes.domain.Patient;

import java.util.List;

public interface GetPatients {
    List<Patient> execute();
}
