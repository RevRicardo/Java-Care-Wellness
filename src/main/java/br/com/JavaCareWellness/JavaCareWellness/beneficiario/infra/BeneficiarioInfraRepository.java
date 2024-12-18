package br.com.JavaCareWellness.JavaCareWellness.beneficiario.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import br.com.JavaCareWellness.JavaCareWellness.beneficiario.appication.repository.BeneficiarioRepository;
import br.com.JavaCareWellness.JavaCareWellness.beneficiario.domain.Beneficiario;
import br.com.JavaCareWellness.JavaCareWellness.hendler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class BeneficiarioInfraRepository implements BeneficiarioRepository {

	private final BeneficiarioSpringDataJPARepository beneficiarioSpringDataJPARepository;

	@Override
	public Beneficiario salva(Beneficiario beneficiario) {
		log.info("[iniciar] BeneficiarioInfraRepository --> salva");
		try {
			beneficiarioSpringDataJPARepository.save(beneficiario);
		} catch (DataIntegrityViolationException e) {
			throw APIException.build(HttpStatus.BAD_REQUEST, "Dados em duplicidade!");
		}
//		beneficiarioSpringDataJPARepository.save(beneficiario);
		log.info("[finaliza] BeneficiarioInfraRepository --> salva");
		return beneficiario;
	}

	@Override
	public List<Beneficiario> buscaTodosBeneficiarios() {
		log.info("[iniciar] BeneficiarioInfraRepository --> buscaTodosBeneficiarios");
		List<Beneficiario> todosBeneficiarios = beneficiarioSpringDataJPARepository.findAll();
		log.info("[finaliza] BeneficiarioInfraRepository --> buscaTodosBeneficiarios");
		return todosBeneficiarios;
	}

	@Override
	public Beneficiario buscaBeneficiarioAtravesId(UUID idBeneficiario) {
		log.info("[iniciar] BeneficiarioInfraRepository --> buscaBeneficiarioAtravesId");
		Beneficiario beneficiario = beneficiarioSpringDataJPARepository.findByIdBeneficiario(idBeneficiario)
				.orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Esse beneficiario não existe!"));
		log.info("[finaliza] BeneficiarioInfraRepository --> buscaBeneficiarioAtravesId");
		return beneficiario;
	}

	@Override
	public void deletaBeneficiario(Beneficiario beneficiario) {
		log.info("[iniciar] BeneficiarioInfraRepository --> deletaBeneficiario");
		beneficiarioSpringDataJPARepository.delete(beneficiario);
		log.info("[finaliza] BeneficiarioInfraRepository --> deletaBeneficiario");
		
	}

	
/**
 * EXEMPLO tratamento erro para usar nos documentos
 * try {
			beneficiarioSpringDataJPARepository.save(beneficiario);
		} catch (DataIntegrityViolationException e) {
			throw APIException.build(HttpStatus.BAD_REQUEST, "Dados em duplicidade!");
		}
 * 
 */
	
}
