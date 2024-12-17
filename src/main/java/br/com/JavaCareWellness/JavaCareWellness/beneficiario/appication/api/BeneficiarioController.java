package br.com.JavaCareWellness.JavaCareWellness.beneficiario.appication.api;

import org.springframework.web.bind.annotation.RestController;

import br.com.JavaCareWellness.JavaCareWellness.beneficiario.appication.service.BeneficiarioServide;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;


@RestController
@Log4j2
@RequiredArgsConstructor
public class BeneficiarioController implements BeneficiarioAPI {

	private final BeneficiarioServide beneficiarioService;

	@Override
	public BeneficiarioResponse postBeneficiario(BeneficiarioRequest beneficiarioRequest) {
		log.info("[inicia] BeneficiarioController --> postBeneficiario");
		BeneficiarioResponse beneficiarioCriado = beneficiarioService.criaBeneficiario(beneficiarioRequest);
		log.info("[finaliza] BeneficiarioController --> postBeneficiario");
		return null;
	}

}
