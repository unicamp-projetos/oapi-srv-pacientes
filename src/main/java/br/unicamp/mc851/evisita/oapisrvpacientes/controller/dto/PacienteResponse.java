package br.unicamp.mc851.evisita.oapisrvpacientes.controller.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PacienteResponse {
    private Long prontuario;
    private String nome;
    private Long cpf;
    private Long rg;
    private Long idMedico;
}
