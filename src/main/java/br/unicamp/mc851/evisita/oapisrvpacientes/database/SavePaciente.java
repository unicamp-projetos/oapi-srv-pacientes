package br.unicamp.mc851.evisita.oapisrvpacientes.database;

import br.unicamp.mc851.evisita.oapisrvpacientes.domain.Paciente;

public interface SavePaciente {
    Paciente execute(Paciente paciente);
}
