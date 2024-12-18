package br.com.JavaCareWellness.JavaCareWellness.beneficiario.appication.api;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import br.com.JavaCareWellness.JavaCareWellness.beneficiario.domain.Beneficiario;
import lombok.Value;

@Value
public class BeneficiarioListResponse {
    private UUID idBeneficiario;
    private String nome;
    private String telefone;
    private LocalDate dataNascimento;
    
	public static List<BeneficiarioListResponse> convert(List<Beneficiario> beneficiarios) {
		return beneficiarios.stream()
				.map(BeneficiarioListResponse::new)
				.collect(Collectors.toList());
	}

	public BeneficiarioListResponse(Beneficiario beneficiario) {
		this.idBeneficiario = beneficiario.getIdBeneficiario();
		this.nome = beneficiario.getNome();
		this.telefone = beneficiario.getTelefone();
		this.dataNascimento = beneficiario.getDataNascimento();
	}
	
	
}
