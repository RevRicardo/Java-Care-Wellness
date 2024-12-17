package br.com.JavaCareWellness.JavaCareWellness.beneficiario.appication.api;

import java.util.UUID;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class BeneficiarioResponse {
	private UUID idBeneficiario;
}
