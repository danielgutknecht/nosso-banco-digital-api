package nossobancodigital.zup.endpoint.v1.dto.response;

import org.springframework.hateoas.RepresentationModel;

public class DocumentoDTOResponse extends RepresentationModel<DocumentoDTOResponse> {

	private Long id;
	private String nome;
	private String tipo;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}	

}
