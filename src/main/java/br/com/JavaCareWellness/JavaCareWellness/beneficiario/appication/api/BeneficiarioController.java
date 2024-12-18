package br.com.JavaCareWellness.JavaCareWellness.beneficiario.appication.api;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.PathVariable;
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

	@Override
	public List<BeneficiarioListResponse> getTodosBeneficiarios() {
		log.info("[iniciar] BeneficiarioController --> getTodosBeneficiarios");
		List<BeneficiarioListResponse> beneficiarios = beneficiarioService.buscaTodosBeneficiarios();
		log.info("[finaliza] BeneficiarioController --> getTodosBeneficiarios");
		return beneficiarios;
	}

	@Override
	public BeneficiarioDetalhadoResponse getBeneficiarioAtravesId(UUID idBeneficiario) {
		log.info("[iniciar] BeneficiarioController --> getBeneficiarioAtravesId");
		log.info("[idBeneficiario] {}", idBeneficiario);
		BeneficiarioDetalhadoResponse BeneficiarioDetalhado = beneficiarioService.buscaBeneficiarioAtravesId(idBeneficiario);
		log.info("[finaliza] BeneficiarioController --> getBeneficiarioAtravesId");
		return BeneficiarioDetalhado;
	}

	@Override
	public void deletaBeneficiarioAtravesId(UUID idBeneficiario) {
		log.info("[iniciar] BeneficiarioController --> deletaBeneficiarioAtravesId");
		log.info("[idBeneficiario] {}", idBeneficiario);
		beneficiarioService.deletaBeneficiarioAtravesId(idBeneficiario);
		log.info("[finaliza] BeneficiarioController --> deletaBeneficiarioAtravesId");
	}

	@Override
	public void patchtBeneficiario(@PathVariable UUID idBeneficiario, @Valid BeneficiarioAlteracaoRequest BeneficiarioAlreracaoRequest) {
		log.info("[iniciar] BeneficiarioController --> patchtBeneficiario");
		log.info("[idBeneficiario] {}", idBeneficiario);
		log.info("[finaliza] BeneficiarioController --> patchtBeneficiario");
		
	}


}
