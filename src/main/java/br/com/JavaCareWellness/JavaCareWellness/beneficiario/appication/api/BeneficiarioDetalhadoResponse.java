package br.com.JavaCareWellness.JavaCareWellness.beneficiario.appication.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import br.com.JavaCareWellness.JavaCareWellness.beneficiario.domain.Beneficiario;
import lombok.Value;

@Value
public class BeneficiarioDetalhadoResponse {
	private UUID idBeneficiario;
    private String nome;
    private String telefone;
    private LocalDate dataNascimento;
    private LocalDateTime dataHoraDaInclusao;
    
    public BeneficiarioDetalhadoResponse(Beneficiario beneficiario) {
    	this.idBeneficiario = beneficiario.getIdBeneficiario();
        this.nome = beneficiario.getNome();
        this.telefone = beneficiario.getTelefone();
        this.dataNascimento = beneficiario.getDataNascimento();
        this.dataHoraDaInclusao = beneficiario.getDataHoraDaInclusao();
	}
}
