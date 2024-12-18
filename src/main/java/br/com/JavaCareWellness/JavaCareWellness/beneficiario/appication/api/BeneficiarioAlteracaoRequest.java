package br.com.JavaCareWellness.JavaCareWellness.beneficiario.appication.api;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import lombok.Value;

@Value
public class BeneficiarioAlteracaoRequest {
    @NotBlank
    private String nome;
    private LocalDate dataNascimento;
}
