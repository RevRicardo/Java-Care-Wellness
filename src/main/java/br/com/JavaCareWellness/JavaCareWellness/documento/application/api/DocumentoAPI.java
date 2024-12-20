package br.com.JavaCareWellness.JavaCareWellness.documento.application.api;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
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
	List<DocumentoBeneficiarioListResponse> getDocumentosDoBeneficiarioComId(@PathVariable UUID idBeneficiario);

	@GetMapping(value = "{idDocumento}")
	@ResponseStatus(code = HttpStatus.OK)
	DocumentoBeneficiarioDetalheResponse getDocumentoDoBeneficiarioComId(@PathVariable UUID idBeneficiario, 
			@PathVariable UUID idDocumento);

	@DeleteMapping(value = "{idDocumento}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	void deleteDocumentoDoBeneficiarioComId(@PathVariable UUID idBeneficiario, @PathVariable UUID idDocumento);
}
