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
public class PacienteModel {
    @Id
    @Column(name = "paciente_prontuario_pk")
    @NonNull
    private Long prontuario;
    @NonNull
    private String nome;
    @NonNull
    private Long rg;
    @NonNull
    private Long cpf;
    private String nomeMae;
    private String nomePai;
    private Long nroCartaoSaude;
    @NonNull
    @Column(name = "medico_pk")
    private Long idMedico;
    private LocalDateTime dataRegistro;
    private LocalDateTime dataAtualizacao;
}
