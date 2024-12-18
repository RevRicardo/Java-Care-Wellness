package br.com.JavaCareWellness.JavaCareWellness.beneficiario.appication.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.JavaCareWellness.JavaCareWellness.beneficiario.appication.api.BeneficiarioAlteracaoRequest;
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
		Beneficiario beneficiario = beneficiarioRepository.buscaBeneficiarioAtravesId(idBeneficiario);
		log.info("[finaliza] BeneficiarioApplicationService --> buscaBeneficiarioAtravesId");
		return new BeneficiarioDetalhadoResponse(beneficiario);
	}

	@Override
	public void deletaBeneficiarioAtravesId(UUID idBeneficiario) {
		log.info("[iniciar] BeneficiarioApplicationService --> deletaBeneficiarioAtravesId");
		Beneficiario beneficiario = beneficiarioRepository.buscaBeneficiarioAtravesId(idBeneficiario);
		beneficiarioRepository.deletaBeneficiario(beneficiario);
		log.info("[finaliza] BeneficiarioApplicationService --> deletaBeneficiarioAtravesId");
	}

	@Override
	public void patchAlteracaoBeneficiario(UUID idBeneficiario, BeneficiarioAlteracaoRequest beneficiarioAlteracaoRequest) {
		log.info("[iniciar] BeneficiarioApplicationService --> patchAlteracaoBeneficiario");
		Beneficiario beneficiario = beneficiarioRepository.buscaBeneficiarioAtravesId(idBeneficiario);
		beneficiario.altera(beneficiarioAlteracaoRequest);
		beneficiarioRepository.salva(beneficiario);
		log.info("[finaliza] BeneficiarioApplicationService --> patchAlteracaoBeneficiario");
		
	}


}
