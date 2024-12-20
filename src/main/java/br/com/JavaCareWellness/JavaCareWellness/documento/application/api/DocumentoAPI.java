package br.com.JavaCareWellness.JavaCareWellness.documento.application.api;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/beneficiario/v1.0/{idBeneficiario}/doc")
public interface DocumentoAPI {
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	DocumentoResponse postDocumento(@PathVariable UUID idBeneficiario,
			@Valid @RequestBody DocumentoRequest documentoRequest);
	
	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	List<DocumentoBeneficiarioListResponse> getDocumentosDoBeneficiariosId(@PathVariable UUID idBeneficiario);

/**
	@GetMapping(value = "/{idBeneficiario}")
	@ResponseStatus(code = HttpStatus.OK)
	BeneficiarioDetalhadoResponse getBeneficiarioAtravesId(@PathVariable UUID idBeneficiario);
	
	@DeleteMapping(value = "/{idBeneficiario}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	void deletaBeneficiarioAtravesId(@PathVariable UUID idBeneficiario);
	
	@PatchMapping(value = "/{idBeneficiario}")
	@ResponseStatus(code = HttpStatus.CREATED)
	void patchAlteracaoBeneficiario(@PathVariable UUID idBeneficiario, 
			@Valid @RequestBody BeneficiarioAlteracaoRequest BeneficiarioAlteracaoRequest);
*/
}
