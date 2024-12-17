package br.com.JavaCareWellness.JavaCareWellness.beneficiario.appication.api;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import lombok.Value;

@Value
public class BeneficiarioRequest {
    @NotBlank
    private String nome;
    private String telefone;
    private LocalDate dataNascimento;
}
