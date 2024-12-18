package br.com.JavaCareWellness.JavaCareWellness.beneficiario.infra;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.JavaCareWellness.JavaCareWellness.beneficiario.appication.repository.BeneficiarioRepository;
import br.com.JavaCareWellness.JavaCareWellness.beneficiario.domain.Beneficiario;
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
		beneficiarioSpringDataJPARepository.save(beneficiario);
		log.info("[finaliza] BeneficiarioInfraRepository --> salva");
		return beneficiario;
	}

	@Override
	public List<Beneficiario> buscaTodosBeneficiarios() {
		log.info("[iniciar] BeneficiarioInfraRepository --> buscaTodosBeneficiarios");
		log.info("[finaliza] BeneficiarioInfraRepository --> buscaTodosBeneficiarios");
		return null;
	}

}
