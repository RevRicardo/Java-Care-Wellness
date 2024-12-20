package br.com.JavaCareWellness.JavaCareWellness.documento.application.api;

import java.util.UUID;

import br.com.JavaCareWellness.JavaCareWellness.documento.domain.Documento;
import br.com.JavaCareWellness.JavaCareWellness.documento.domain.TipoDocumento;
import lombok.Value;

@Value
public class DocumentoBeneficiarioDetalheResponse {

	private UUID idDocumento;
	private TipoDocumento tipoDocumento; 
	private String numero;
	
	public DocumentoBeneficiarioDetalheResponse(Documento documento) {
		this.idDocumento = documento.getIdDocumento();
		this.tipoDocumento = documento.getTipoDocumento();
		this.numero = documento.getNumero();
	}

}