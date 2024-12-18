package br.com.JavaCareWellness.JavaCareWellness.beneficiario.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.JavaCareWellness.JavaCareWellness.beneficiario.domain.Beneficiario;

public interface BeneficiarioSpringDataJPARepository extends JpaRepository<Beneficiario, UUID>{

}
