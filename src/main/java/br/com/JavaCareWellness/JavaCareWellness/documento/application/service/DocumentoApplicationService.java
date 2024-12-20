package br.com.JavaCareWellness.JavaCareWellness.documento.application.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.JavaCareWellness.JavaCareWellness.beneficiario.appication.service.BeneficiarioService;
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
}
