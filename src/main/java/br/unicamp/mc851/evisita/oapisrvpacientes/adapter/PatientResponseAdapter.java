package br.unicamp.mc851.evisita.oapisrvpacientes.adapter;

import br.unicamp.mc851.evisita.oapisrvpacientes.controller.dto.PatientResponse;
import br.unicamp.mc851.evisita.oapisrvpacientes.database.entity.PatientModel;
import br.unicamp.mc851.evisita.oapisrvpacientes.domain.Patient;
import lombok.experimental.UtilityClass;
import org.springframework.beans.BeanUtils;

@UtilityClass
public class PatientResponseAdapter {

    public static PatientResponse convert(Patient patient) {
        return PatientResponse.builder()
                .medicalRecord(patient.getMedicalRecord())
                .name(patient.getName())
                .cpf(patient.getCpf())
                .rg(patient.getRg())
                .doctor(patient.getDoctor())
                .bed(patient.getBed())
                .room(patient.getRoom())
                .functionalUnit(patient.getFunctionalUnit())
                .build();
    }

    public static PatientResponse convert(PatientModel model) {
        var patientResponse = PatientResponse.builder().build();
        BeanUtils.copyProperties(model, patientResponse);
        return patientResponse;
    }
}
