package br.com.JavaCareWellness.JavaCareWellness.beneficiario.infra;

import org.springframework.stereotype.Repository;

import br.com.JavaCareWellness.JavaCareWellness.beneficiario.appication.repository.BeneficiaRepository;
import br.com.JavaCareWellness.JavaCareWellness.beneficiario.domain.Beneficiario;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
public class BeneficiarioInfraRepository implements BeneficiaRepository {

	@Override
	public Beneficiario salva(Beneficiario beneficiario) {
		log.info("[iniciar] BeneficiarioInfraRepository --> salva");
		log.info("[finaliza] BeneficiarioInfraRepository --> salva");
		return beneficiario;
	}

}
