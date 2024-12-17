package br.com.JavaCareWellness.JavaCareWellness.beneficiario.appication.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/beneficiario/v1.0")
public interface BeneficiarioAPI {
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	BeneficiarioResponse postBeneficiario(@Valid @RequestBody BeneficiarioRequest beneficiarioRequest);

}
