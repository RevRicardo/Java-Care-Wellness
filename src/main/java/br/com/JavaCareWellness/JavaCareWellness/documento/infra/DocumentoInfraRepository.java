package br.com.JavaCareWellness.JavaCareWellness.documento.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import br.com.JavaCareWellness.JavaCareWellness.documento.application.service.DocumentoRepository;
import br.com.JavaCareWellness.JavaCareWellness.documento.domain.Documento;
import br.com.JavaCareWellness.JavaCareWellness.hendler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class DocumentoInfraRepository implements DocumentoRepository {
	private final DocumentoSpringDataJPARepository documentoSpringDataJPARepository; 

	@Override
	public Documento salvaDocumento(Documento documento) {
		log.info("[inicia] DocumentoInfraRepository --> salvaDocumento");
		documentoSpringDataJPARepository.save(documento);
		log.info("[finaliza] DocumentoInfraRepository --> salvaDocumento");
		return documento;
	}

	@Override
	public List<Documento> buscaDocumentosDoBeneficiarioComId(UUID idBeneficiario) {
		log.info("[inicia] DocumentoInfraRepository --> buscaDocumentosDoBeneficiarioComId");
		var documentos = documentoSpringDataJPARepository.findByIdBeneficiarioDoc(idBeneficiario);
		log.info("[finaliza] DocumentoInfraRepository --> buscaDocumentosDoBeneficiarioComId");
		return documentos;
	}

	@Override
	public Documento buscaDocumentoPeloId(UUID idDocumento) {
		log.info("[inicia] DocumentoInfraRepository --> buscaDocumentoPeloId");
		var documento = documentoSpringDataJPARepository.findById(idDocumento)
				.orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Documento não existe para o IdDocumento = " + idDocumento));
		log.info("[finaliza] DocumentoInfraRepository --> buscaDocumentoPeloId");
		return documento;
	}

	@Override
	public void deletaDocumento(Documento documento) {
		log.info("[inicia] DocumentoInfraRepository --> deletaDocumento");
		documentoSpringDataJPARepository.delete(documento); 
		log.info("[finaliza] DocumentoInfraRepository --> deletaDocumento");
		
	}


}
