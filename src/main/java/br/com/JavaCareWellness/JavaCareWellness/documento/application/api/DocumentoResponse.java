package br.com.JavaCareWellness.JavaCareWellness.documento.application.api;

import java.util.UUID;

import lombok.Builder;
import lombok.Value;

@Value
public class DocumentoResponse {
	private UUID idDocumento;
}
