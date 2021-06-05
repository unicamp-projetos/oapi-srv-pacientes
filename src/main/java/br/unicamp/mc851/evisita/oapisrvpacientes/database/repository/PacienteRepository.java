package br.unicamp.mc851.evisita.oapisrvpacientes.database.repository;

import br.unicamp.mc851.evisita.oapisrvpacientes.database.entity.PacienteModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<PacienteModel, Long> {
}
