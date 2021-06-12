package br.unicamp.mc851.evisita.oapisrvpacientes.database;

import br.unicamp.mc851.evisita.oapisrvpacientes.domain.Patient;

public interface SavePatient {
    Patient execute(Patient patient);
}
