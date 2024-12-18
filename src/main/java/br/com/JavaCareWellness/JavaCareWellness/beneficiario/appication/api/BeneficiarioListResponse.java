package br.com.JavaCareWellness.JavaCareWellness.beneficiario.appication.api;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import br.com.JavaCareWellness.JavaCareWellness.beneficiario.domain.Beneficiario;

public class BeneficiarioListResponse {
    private UUID idBeneficiario;
    private String nome;
    private String telefone;
    private LocalDate dataNascimento;
    
	public static List<BeneficiarioListResponse> convert(List<Beneficiario> beneficiarios) {
		// TODO Auto-generated method stub
		return null;
	}
}
