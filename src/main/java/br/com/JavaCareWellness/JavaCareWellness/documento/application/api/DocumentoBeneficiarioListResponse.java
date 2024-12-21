package br.com.JavaCareWellness.JavaCareWellness.documento.application.api;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import br.com.JavaCareWellness.JavaCareWellness.documento.domain.Documento;
import br.com.JavaCareWellness.JavaCareWellness.documento.domain.TipoDocumento;
import lombok.Value;

@Value
public class DocumentoBeneficiarioListResponse {
	private UUID idDocumento;
	private TipoDocumento tipoDocumento; 
	private String numero; 
    private LocalDateTime dataHoraDaInclusao;
    
public static List<DocumentoBeneficiarioListResponse> converte(List<Documento> documentosDoBeneficiario) { 
	return documentosDoBeneficiario.stream() 
			.map(DocumentoBeneficiarioListResponse::new)
			.collect(Collectors.toList()); }

	public DocumentoBeneficiarioListResponse(Documento documento) {
		this.idDocumento = documento.getIdDocumento();
		this.tipoDocumento = documento.getTipoDocumento();
		this.numero = documento.getNumero();
		this.dataHoraDaInclusao = documento.getDataHoraDaInclusao();
		
	}
}
