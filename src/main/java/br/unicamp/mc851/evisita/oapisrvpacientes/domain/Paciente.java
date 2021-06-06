package br.unicamp.mc851.evisita.oapisrvpacientes.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Paciente {
    private Long prontuario;
    private String nome;
    private Long rg;
    private Long cpf;
    private String nomeMae;
    private String nomePai;
    private Long nroCartaoSaude;
    private Long idMedico;
}
