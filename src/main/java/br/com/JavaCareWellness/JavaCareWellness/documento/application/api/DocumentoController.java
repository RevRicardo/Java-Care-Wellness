package br.com.JavaCareWellness.JavaCareWellness.documento.application.api;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.RestController;

import br.com.JavaCareWellness.JavaCareWellness.documento.application.service.DocumentoService;
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
		log.info("[idBeneficiario] {}", idBeneficiario);
		DocumentoResponse documento = documentoService.criaDocumento(idBeneficiario, documentoRequest);
		log.info("[finaliza] DocumentoController -->  postDocumento");
		return documento;
	}

	@Override
	public List<DocumentoBeneficiarioListResponse> getDocumentosDoBeneficiarioComId(UUID idBeneficiario) {
		log.info("[inicia] DocumentoController -->  getDocumentosDoBeneficiarioComId");
		log.info("[idBeneficiario] {}, idBeneficiario");
		List<DocumentoBeneficiarioListResponse> documentosDoBeneficiario = documentoService.buscaDocumentosDoBeneficiarioComId(idBeneficiario);
		log.info("[finaliza] DocumentoController -->  getDocumentosDoBeneficiarioComId");
		return documentosDoBeneficiario;
	}

	@Override
	public DocumentoBeneficiarioDetalheResponse getDocumentoDoBeneficiarioComId(UUID idBeneficiario, UUID idDocumento) {
		log.info("[inicia] DocumentoController -->  getDocumentoDoBeneficiarioComId");
		log.info("[idBeneficiario] {} - [idDocumento] {}", idBeneficiario, idDocumento);
		DocumentoBeneficiarioDetalheResponse documento = documentoService.buscaDocumentoDoBeneficiarioComId(idBeneficiario, idDocumento);
		log.info("[finaliza] DocumentoController -->  getDocumentoDoBeneficiarioComId");
		return documento;
	}

	@Override
	public void deleteDocumentoDoBeneficiarioComId(UUID idBeneficiario, UUID idDocumento) {
		log.info("[inicia] DocumentoController -->  deleteDocumentoDoBeneficiarioComId");
		log.info("[idBeneficiario] {} - [idDocumento] {}", idBeneficiario, idDocumento);
		documentoService.deletaDocumentoDoBeneficiarioComId(idBeneficiario, idDocumento);
		log.info("[finaliza] DocumentoController -->  deleteDocumentoDoBeneficiarioComId");
	}

	@Override
	public void patchtDocumento(UUID idBeneficiario, UUID idDocumento,
			@Valid DocumentoAlteracaoRequest documentoAlteracaoRequest) {
		log.info("[inicia] DocumentoController -->  patchtDocumento");
		log.info("[idBeneficiario] {} - [idDocumento] {}", idBeneficiario, idDocumento);
		documentoService.alteraDocumentoDoClienteComId(idBeneficiario, idDocumento, documentoAlteracaoRequest);
		log.info("[inicia] DocumentoController -->  patchtDocumento");
	}
}