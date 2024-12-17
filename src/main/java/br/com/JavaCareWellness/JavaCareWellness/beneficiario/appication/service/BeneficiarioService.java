package br.com.JavaCareWellness.JavaCareWellness.beneficiario.appication.service;

import br.com.JavaCareWellness.JavaCareWellness.beneficiario.appication.api.BeneficiarioRequest;
import br.com.JavaCareWellness.JavaCareWellness.beneficiario.appication.api.BeneficiarioResponse;

public interface BeneficiarioService {
	BeneficiarioResponse criaBeneficiario(BeneficiarioRequest beneficiarioRequest);

}
