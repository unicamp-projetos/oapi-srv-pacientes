package br.unicamp.mc851.evisita.oapisrvpacientes.controller.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class PacienteRequest {
    private Long prontuario;
    private String nome;
    private Long rg;
    private Long cpf;
    private String nomeMae;
    private String nomePai;
    private Long nroCartaoSaude;
    private Long idMedico;
    private List<Long> idAcompanhantes;
}
