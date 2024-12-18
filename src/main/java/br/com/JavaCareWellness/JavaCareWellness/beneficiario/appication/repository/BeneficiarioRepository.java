package br.com.JavaCareWellness.JavaCareWellness.beneficiario.appication.repository;

import java.util.List;

import br.com.JavaCareWellness.JavaCareWellness.beneficiario.domain.Beneficiario;

public interface BeneficiarioRepository {
	Beneficiario salva(Beneficiario beneficiario);
	List<Beneficiario> buscaTodosBeneficiarios();
}
