package br.com.JavaCareWellness.JavaCareWellness.beneficiario.appication.api;

import org.springframework.web.bind.annotation.RestController;

import br.com.JavaCareWellness.JavaCareWellness.beneficiario.appication.service.BeneficiarioService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class BeneficiarioController implements BeneficiarioAPI {

	private final BeneficiarioService beneficiarioService;

	@Override
	public BeneficiarioResponse postBeneficiario(@Valid BeneficiarioRequest beneficiarioRequest) {
		log.info("[iniciar] BeneficiarioController --> postBeneficiario");
		BeneficiarioResponse beneficiarioCriado = beneficiarioService.criaBeneficiario(beneficiarioRequest);
		log.info("[finaliza] BeneficiarioController --> postBeneficiario");
		return beneficiarioCriado;
	}

}
