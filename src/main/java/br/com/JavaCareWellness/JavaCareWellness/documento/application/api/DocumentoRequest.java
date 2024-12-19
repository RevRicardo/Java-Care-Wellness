package br.com.JavaCareWellness.JavaCareWellness.documento.application.api;

import java.time.LocalDateTime;

import br.com.JavaCareWellness.JavaCareWellness.documento.domain.TipoDocumento;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

@Value
public class DocumentoRequest { 
	@NotNull 
	@Enumerated(EnumType.STRING) 
	private TipoDocumento tipoDocumento;  
	private String numero; 
}
