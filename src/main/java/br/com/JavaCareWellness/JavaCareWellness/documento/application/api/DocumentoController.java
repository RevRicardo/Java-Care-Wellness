package br.com.JavaCareWellness.JavaCareWellness.documento.application.api;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.RestController;

import br.com.JavaCareWellness.JavaCareWellness.documento.application.service.DocumentoService;
import br.com.JavaCareWellness.JavaCareWellness.documento.domain.Documento;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class DocumentoController implements DocumentoAPI {

	private final DocumentoService documentoService;

	@Override
	public DocumentoResponse postDocumento(UUID idBeneficiario, @Valid DocumentoRequest documentoRequest) {
		log.info("[inicia] DocumentoController -->  postDocumento");
		log.info("[idBeneficiario] {}, idBeneficiario");
		DocumentoResponse documento = documentoService.criaDocumento(idBeneficiario, documentoRequest);
		log.info("[finaliza] DocumentoController -->  postDocumento");
		return documento;
	}

	@Override
	public List<DocumentoBeneficiarioListResponse> getDocumentosDoBeneficiariosId(UUID idBeneficiario) {
		log.info("[inicia] DocumentoController -->  getDocumentosDoBeneficiariosId");
		log.info("[idBeneficiario] {}, idBeneficiario");
		log.info("[finaliza] DocumentoController -->  getDocumentosDoBeneficiariosId");

		return null;
	}
}
