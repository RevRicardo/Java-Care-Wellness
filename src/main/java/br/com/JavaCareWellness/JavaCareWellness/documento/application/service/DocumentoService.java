package br.com.JavaCareWellness.JavaCareWellness.documento.application.service;

import java.util.List;
import java.util.UUID;

import br.com.JavaCareWellness.JavaCareWellness.documento.application.api.DocumentoBeneficiarioDetalheResponse;
import br.com.JavaCareWellness.JavaCareWellness.documento.application.api.DocumentoBeneficiarioListResponse;
import br.com.JavaCareWellness.JavaCareWellness.documento.application.api.DocumentoRequest;
import br.com.JavaCareWellness.JavaCareWellness.documento.application.api.DocumentoResponse;
import jakarta.validation.Valid;

public interface DocumentoService {
	DocumentoResponse criaDocumento(UUID idBeneficiario, @Valid DocumentoRequest documentoRequest);
	List<DocumentoBeneficiarioListResponse> buscaDocumentosDoBeneficiarioComId(UUID idBeneficiario);
	DocumentoBeneficiarioDetalheResponse buscaDocumentoDoBeneficiarioComId(UUID idBeneficiario, UUID idDocumento);
	void deletaDocumentoDoBeneficiarioComId(UUID idBeneficiario, UUID idDocumento);
	
}
