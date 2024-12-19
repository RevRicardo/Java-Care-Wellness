package br.com.JavaCareWellness.JavaCareWellness.documento.application.api;

import java.util.UUID;

import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
public class DocumentoController implements DocumentoAPI {

	@Override
	public DocumentoResponse postDocumento(UUID idBeneficiario, 
			@Valid DocumentoRequest documentoRequest) {
		log.info("[inicia] DocumentoController -->  postDocumento");
		log.info("[idBeneficiario] {}, idBeneficiario");
		log.info("[finaliza] DocumentoController -->  postDocumento");
		return null;
	}
}
