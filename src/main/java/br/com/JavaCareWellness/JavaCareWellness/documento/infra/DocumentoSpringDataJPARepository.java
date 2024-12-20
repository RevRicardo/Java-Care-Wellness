package br.com.JavaCareWellness.JavaCareWellness.documento.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.JavaCareWellness.JavaCareWellness.documento.domain.Documento;

public interface DocumentoSpringDataJPARepository extends JpaRepository<Documento, UUID> {
	
}
