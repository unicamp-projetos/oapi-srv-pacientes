package br.unicamp.mc851.evisita.oapisrvpacientes.database;

import br.unicamp.mc851.evisita.oapisrvpacientes.domain.Paciente;

import java.util.List;

public interface GetPacientes {
    List<Paciente> execute();
}
