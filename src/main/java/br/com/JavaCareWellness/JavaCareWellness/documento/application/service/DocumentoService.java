package br.com.JavaCareWellness.JavaCareWellness.documento.application.service;

import java.util.UUID;

import br.com.JavaCareWellness.JavaCareWellness.documento.application.api.DocumentoRequest;
import br.com.JavaCareWellness.JavaCareWellness.documento.application.api.DocumentoResponse;
import jakarta.validation.Valid;

public interface DocumentoService {
	DocumentoResponse criaDocumento(UUID idBeneficiario, @Valid DocumentoRequest documentoRequest);
}
