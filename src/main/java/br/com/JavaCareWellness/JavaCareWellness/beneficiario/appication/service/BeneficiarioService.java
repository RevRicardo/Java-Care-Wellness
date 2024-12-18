package br.com.JavaCareWellness.JavaCareWellness.beneficiario.appication.service;

import java.util.List;

import br.com.JavaCareWellness.JavaCareWellness.beneficiario.appication.api.BeneficiarioListResponse;
import br.com.JavaCareWellness.JavaCareWellness.beneficiario.appication.api.BeneficiarioRequest;
import br.com.JavaCareWellness.JavaCareWellness.beneficiario.appication.api.BeneficiarioResponse;
import jakarta.validation.Valid;

public interface BeneficiarioService {
	BeneficiarioResponse criaBeneficiario(@Valid BeneficiarioRequest beneficiarioRequest);
	List<BeneficiarioListResponse> buscaTodosBeneficiarios();
}
