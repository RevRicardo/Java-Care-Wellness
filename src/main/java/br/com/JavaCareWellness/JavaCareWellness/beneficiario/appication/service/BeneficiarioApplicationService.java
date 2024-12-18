package br.com.JavaCareWellness.JavaCareWellness.beneficiario.appication.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.JavaCareWellness.JavaCareWellness.beneficiario.appication.api.BeneficiarioDetalhadoResponse;
import br.com.JavaCareWellness.JavaCareWellness.beneficiario.appication.api.BeneficiarioListResponse;
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

	@Override
	public List<BeneficiarioListResponse> buscaTodosBeneficiarios() {
		log.info("[iniciar] BeneficiarioApplicationService --> buscaTodosBeneficiarios");
		List<Beneficiario> beneficiarios = beneficiarioRepository.buscaTodosBeneficiarios();
		log.info("[finaliza] BeneficiarioApplicationService --> buscaTodosBeneficiarios");
		return BeneficiarioListResponse.convert(beneficiarios);
	}

	@Override
	public BeneficiarioDetalhadoResponse buscaBeneficiarioAtravesId(UUID idBeneficiario) {
		log.info("[iniciar] BeneficiarioApplicationService --> buscaBeneficiarioAtravesId");
		log.info("[finaliza] BeneficiarioApplicationService --> buscaBeneficiarioAtravesId");
		return null;
	}

}
