package br.com.JavaCareWellness.JavaCareWellness.beneficiario.appication.service;

import org.springframework.stereotype.Service;

import br.com.JavaCareWellness.JavaCareWellness.beneficiario.appication.api.BeneficiarioRequest;
import br.com.JavaCareWellness.JavaCareWellness.beneficiario.appication.api.BeneficiarioResponse;
import br.com.JavaCareWellness.JavaCareWellness.beneficiario.appication.repository.BeneficiarioRepository;
import br.com.JavaCareWellness.JavaCareWellness.beneficiario.domain.Beneficiario;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class BeneficiarioApplicationService implements BeneficiarioService {

	private final BeneficiarioRepository beneficiarioRepository;

	@Override
	public BeneficiarioResponse criaBeneficiario(@Valid BeneficiarioRequest beneficiarioRequest) {
		log.info("[iniciar] BeneficiarioApplicationService --> criaBeneficiario");
		Beneficiario beneficiario = beneficiarioRepository.salva(new Beneficiario(beneficiarioRequest));
		log.info("[finaliza] BeneficiarioApplicationService --> criaBeneficiario");
		return BeneficiarioResponse.builder()
				.idBeneficiario(beneficiario.getIdBeneficiario())
				.build();
	}

}
