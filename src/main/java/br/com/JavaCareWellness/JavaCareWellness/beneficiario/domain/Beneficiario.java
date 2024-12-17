package br.com.JavaCareWellness.JavaCareWellness.beneficiario.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import br.com.JavaCareWellness.JavaCareWellness.beneficiario.appication.api.BeneficiarioRequest;
import br.com.JavaCareWellness.JavaCareWellness.beneficiario.appication.api.BeneficiarioResponse;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Beneficiario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, unique = true, nullable = false)
    private UUID idBeneficiario;
    @NotBlank
    private String nome;
    private String telefone;
    private LocalDate dataNascimento;
    private LocalDateTime dataHoraDaInclusao;
    private LocalDateTime dataHoraAtualizacao;
    
    public Beneficiario(BeneficiarioRequest beneficiarioRequest) {
		this.nome = beneficiarioRequest.getNome();
		this.telefone = beneficiarioRequest.getTelefone();
		this.dataNascimento = beneficiarioRequest.getDataNascimento();
		this.dataHoraDaInclusao = LocalDateTime.now();
	}

	public BeneficiarioResponse criaBeneficiario(BeneficiarioRequest beneficiarioRequest) {
		// TODO Auto-generated method stub
		return null;
	}

    
}
