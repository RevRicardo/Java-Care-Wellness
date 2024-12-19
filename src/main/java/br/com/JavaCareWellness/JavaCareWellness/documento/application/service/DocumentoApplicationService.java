package br.com.JavaCareWellness.JavaCareWellness.documento.application.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.JavaCareWellness.JavaCareWellness.documento.application.api.DocumentoRequest;
import br.com.JavaCareWellness.JavaCareWellness.documento.application.api.DocumentoResponse;
import jakarta.validation.Valid;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class DocumentoApplicationService implements DocumentoService {

	@Override
	public DocumentoResponse criaDocumento(UUID idBeneficiario, @Valid DocumentoRequest documentoRequest) {
		log.info("[inicia] DocumentoApplicationService --> criaDocumento");
		log.info("[finaliza] DocumentoApplicationService --> criaDocumento");
				
		return null;
	}
}
