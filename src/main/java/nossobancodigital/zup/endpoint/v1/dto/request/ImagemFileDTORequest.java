package nossobancodigital.zup.endpoint.v1.dto.request;

import javax.validation.constraints.NotEmpty;

import org.springframework.hateoas.RepresentationModel;

public class ImagemFileDTORequest {
	
	private Long id;
	@NotEmpty(message = "Sobrenome não pode ser vazio.")
	private byte[] fotoFrenteCNH;
	@NotEmpty(message = "Sobrenome não pode ser vazio.")
	private byte[] fotoVersoCNH;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public byte[] getFotoFrenteCNH() {
		return fotoFrenteCNH;
	}
	public void setFotoFrenteCNH(byte[] fotoFrenteCNH) {
		this.fotoFrenteCNH = fotoFrenteCNH;
	}
	public byte[] getFotoVersoCNH() {
		return fotoVersoCNH;
	}
	public void setFotoVersoCNH(byte[] fotoVersoCNH) {
		this.fotoVersoCNH = fotoVersoCNH;
	}

}
