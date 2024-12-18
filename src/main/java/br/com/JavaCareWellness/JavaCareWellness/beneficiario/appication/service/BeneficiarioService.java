package br.com.JavaCareWellness.JavaCareWellness.beneficiario.appication.service;

import br.com.JavaCareWellness.JavaCareWellness.beneficiario.appication.api.BeneficiarioRequest;
import br.com.JavaCareWellness.JavaCareWellness.beneficiario.appication.api.BeneficiarioResponse;
import jakarta.validation.Valid;

public interface BeneficiarioService {
	BeneficiarioResponse criaBeneficiario(@Valid BeneficiarioRequest beneficiarioRequest);
}
