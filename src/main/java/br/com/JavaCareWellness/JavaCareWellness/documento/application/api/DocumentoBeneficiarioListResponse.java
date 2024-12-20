package br.com.JavaCareWellness.JavaCareWellness.documento.application.api;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;


import br.com.JavaCareWellness.JavaCareWellness.documento.domain.Documento;
import br.com.JavaCareWellness.JavaCareWellness.documento.domain.TipoDocumento;
import lombok.Value;

@Value
@Getter
public class DocumentoBeneficiarioListResponse {
    
	private TipoDocumento tipoDocumento; 
	private String numero; 
    private LocalDateTime dataHoraDaInclusao;
    
public static List<DocumentoBeneficiarioListResponse> converte(List<Documento> documentosDoBeneficiario) { 
	return documentosDoBeneficiario.stream() 
			.map(documento -> new DocumentoBeneficiarioListResponse(documento, beneficiario))
			.collect(Collectors.toList()); }

	public DocumentoBeneficiarioListResponse(Documento documento) {
		
		this.tipoDocumento = documento.getTipoDocumento();
		this.numero = documento.getNumero();
		this.dataHoraDaInclusao = documento.getDataHoraDaInclusao();
		
	}
}
