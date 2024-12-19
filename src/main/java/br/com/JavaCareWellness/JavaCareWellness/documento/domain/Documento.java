package br.com.JavaCareWellness.JavaCareWellness.documento.domain;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
	@NotNull 
	@Enumerated(EnumType.STRING) 
	private TipoDocumento tipoDocumento; 
	@NotBlank @Column(unique = true) 
	private String numero; 
	private LocalDateTime dataHoraDaInclusao; 
	private LocalDateTime dataHoraAtualizacao; 

}
