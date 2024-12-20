package br.com.JavaCareWellness.JavaCareWellness.documento.application.service;

import java.util.List;
import java.util.UUID;

import br.com.JavaCareWellness.JavaCareWellness.documento.domain.Documento;

public interface DocumentoRepository {
	Documento salvaDocumento(Documento documento);
	List<Documento> buscaDocumentosDoBeneficiarioComId(UUID idBeneficiario);
}
