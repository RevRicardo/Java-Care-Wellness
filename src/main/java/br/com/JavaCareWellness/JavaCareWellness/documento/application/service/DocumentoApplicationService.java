package br.com.JavaCareWellness.JavaCareWellness.documento.application.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.JavaCareWellness.JavaCareWellness.beneficiario.appication.service.BeneficiarioService;
import br.com.JavaCareWellness.JavaCareWellness.documento.application.api.DocumentoBeneficiarioDetalheResponse;
import br.com.JavaCareWellness.JavaCareWellness.documento.application.api.DocumentoBeneficiarioListResponse;
import br.com.JavaCareWellness.JavaCareWellness.documento.application.api.DocumentoRequest;
import br.com.JavaCareWellness.JavaCareWellness.documento.application.api.DocumentoResponse;
import br.com.JavaCareWellness.JavaCareWellness.documento.domain.Documento;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class DocumentoApplicationService implements DocumentoService {
	private final BeneficiarioService beneficiarioService;
	private final DocumentoRepository documentoRepository;
	@Override
	public DocumentoResponse criaDocumento(UUID idBeneficiario, @Valid DocumentoRequest documentoRequest) {
		log.info("[inicia] DocumentoApplicationService --> criaDocumento");
		beneficiarioService.buscaBeneficiarioAtravesId(idBeneficiario);
		Documento documento = documentoRepository.salvaDocumento(new Documento(idBeneficiario, documentoRequest));
		log.info("[finaliza] DocumentoApplicationService --> criaDocumento");
		return new DocumentoResponse(documento.getIdDocumento());
	}
	@Override
	public List<DocumentoBeneficiarioListResponse> buscaDocumentosDoBeneficiarioComId(UUID idBeneficiario) {
		log.info("[inicia] DocumentoApplicationService --> buscaDocumentosDoBeneficiarioComId");
		beneficiarioService.buscaBeneficiarioAtravesId(idBeneficiario);
		List<Documento> documentosDoBeneficiario = documentoRepository.buscaDocumentosDoBeneficiarioComId(idBeneficiario);
		log.info("[finaliza] DocumentoApplicationService --> buscaDocumentosDoBeneficiarioComId");
		return DocumentoBeneficiarioListResponse.converte(documentosDoBeneficiario);
	}
	@Override
	public DocumentoBeneficiarioDetalheResponse buscaDocumentoDoBeneficiarioComId(UUID idBeneficiario,
			UUID idDocumento) {
		log.info("[inicia] DocumentoApplicationService --> buscaDocumentoDoBeneficiarioComId");
		beneficiarioService.buscaBeneficiarioAtravesId(idBeneficiario);
		Documento documento = documentoRepository.buscaDocumentoPeloId(idDocumento);
		log.info("[finaliza] DocumentoApplicationService --> buscaDocumentoDoBeneficiarioComId");
		return new DocumentoBeneficiarioDetalheResponse(documento);
	}
}
