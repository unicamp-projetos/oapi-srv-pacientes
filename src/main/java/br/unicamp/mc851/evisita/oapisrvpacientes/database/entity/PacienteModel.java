package br.unicamp.mc851.evisita.oapisrvpacientes.database.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

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
    @ElementCollection
    private Set<Long> idAcompanhantes;
    private LocalDateTime dataRegistro;
    private LocalDateTime dataAtualizacao;
}
