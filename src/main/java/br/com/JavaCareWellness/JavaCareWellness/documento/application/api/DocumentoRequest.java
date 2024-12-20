package br.com.JavaCareWellness.JavaCareWellness.documento.application.api;

import br.com.JavaCareWellness.JavaCareWellness.documento.domain.TipoDocumento;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

@Value
public class DocumentoRequest { 
	@NotNull 
	private TipoDocumento tipoDocumento;
	@NotBlank
	private String numero; 
}
