package br.unicamp.mc851.evisita.oapisrvpacientes.database.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Data
@Builder
@Entity
@Table(name = "pacientes")
@AllArgsConstructor
@NoArgsConstructor
public class PatientModel {
    @Id
    @Column(name = "paciente_prontuario_pk")
    @NonNull
    private Long medicalRecord;
    @NonNull
    private String name;
    @NonNull
    private String rg;
    @NonNull
    private Long cpf;
    private String motherName;
    private String fatherName;
    private Long susCardNumber;
    @Column(name = "medico_pk")
    private @NonNull String doctor;
    private LocalDateTime recordDate;
    private LocalDateTime updateDate;
    private String functionalUnit;
    private String bed;
    private String room;
}
