package br.com.JavaCareWellness.JavaCareWellness.beneficiario.appication.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import lombok.Value;

@Value
public class BeneficiarioDetalhadoResponse {
    private UUID idBeneficiario;
    private String nome;
    private String telefone;
    private LocalDate dataNascimento;
    private LocalDateTime dataHoraDaInclusao;
}
