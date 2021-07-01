package br.unicamp.mc851.evisita.oapisrvpacientes.database.repository;

import br.unicamp.mc851.evisita.oapisrvpacientes.database.entity.PatientModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<PatientModel, String> {
}
