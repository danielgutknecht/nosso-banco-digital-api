package nossobancodigital.zup.endpoint.v1.dto.request;

import javax.validation.constraints.NotNull;

import org.springframework.web.multipart.MultipartFile;

public class DocumentoDTORequest {
	
	@NotNull(message = "Documento é obrigatório.")
	private MultipartFile documentoFrente;
	
	
	public MultipartFile getDocumentoFrente() {
		return documentoFrente;
	}
	public void setDocumentoFrente(MultipartFile documentoFrente) {
		this.documentoFrente = documentoFrente;
	}
		

}
