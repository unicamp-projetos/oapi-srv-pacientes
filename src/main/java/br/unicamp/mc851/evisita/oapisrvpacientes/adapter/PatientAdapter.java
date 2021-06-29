package br.unicamp.mc851.evisita.oapisrvpacientes.adapter;

import br.unicamp.mc851.evisita.oapisrvpacientes.controller.dto.PatientRequest;
import br.unicamp.mc851.evisita.oapisrvpacientes.database.entity.PatientModel;
import br.unicamp.mc851.evisita.oapisrvpacientes.domain.Patient;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.experimental.UtilityClass;

@UtilityClass
public class PatientAdapter {

    public static Patient convert(PatientModel model) {
        return Patient.builder()
                .name(model.getName())
                .motherName(model.getMotherName())
                .fatherName(model.getFatherName())
                .cpf(model.getCpf())
                .rg(model.getRg())
                .medicalRecord(model.getMedicalRecord())
                .susCardNumber(model.getSusCardNumber())
                .doctor(model.getDoctor())
                .bed(model.getBed())
                .room(model.getRoom())
                .functionalUnit(model.getFunctionalUnit())
                .build();
    }

    public static Patient convert(PatientRequest request) {
        return Patient.builder()
                .medicalRecord(request.getMedicalRecord())
                .name(request.getName())
                .fatherName(request.getFatherName())
                .motherName(request.getMotherName())
                .susCardNumber(request.getSusCardNumber())
                .rg(request.getRg())
                .cpf(request.getCpf())
                .doctor(request.getDoctor())
                .bed(request.getBed())
                .room(request.getRoom())
                .functionalUnit(request.getFunctionalUnit())
                .build();
    }
}
