package br.com.JavaCareWellness.JavaCareWellness;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class JavaCareWellnessApplication {
	
	@GetMapping
	public String getHomeTeste() {
		return "Cadastro de beneficiario e seus documentos";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(JavaCareWellnessApplication.class, args);
	}
}
