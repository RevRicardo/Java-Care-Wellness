package br.com.JavaCareWellness.JavaCareWellness.documento.domain;

import java.time.LocalDateTime;
import java.util.UUID;

import br.com.JavaCareWellness.JavaCareWellness.documento.application.api.DocumentoAlteracaoRequest;
import br.com.JavaCareWellness.JavaCareWellness.documento.application.api.DocumentoRequest;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE) 
@Getter 
@Entity 
public class Documento { 

	@Id @GeneratedValue(strategy = GenerationType.AUTO) 
	@Column(columnDefinition = "uuid", name = "idDocumento", updatable = false, unique = true, nullable = false) 
	private UUID idDocumento;
	private UUID idBeneficiarioDoc; 
	@NotNull  
	@Enumerated(EnumType.STRING) 
	private TipoDocumento tipoDocumento; 
	@NotBlank 
	@Column(unique = true) 
	private String numero; 
    private LocalDateTime dataHoraDaInclusao;
    private LocalDateTime dataHoraAtualizacao;
    
   	public Documento(UUID idBeneficiario, @Valid DocumentoRequest documentoRequest) {
		this.idBeneficiarioDoc = idBeneficiario;
		this.tipoDocumento = documentoRequest.getTipoDocumento();
		this.numero = documentoRequest.getNumero();
		this.dataHoraDaInclusao = LocalDateTime.now();
	}

	public void altera(DocumentoAlteracaoRequest documentoAlteracaoRequest) {
		this.tipoDocumento = documentoAlteracaoRequest.getTipoDocumento();
		this.numero = documentoAlteracaoRequest.getNumero();
		this.dataHoraAtualizacao = LocalDateTime.now();
		
	}
}
