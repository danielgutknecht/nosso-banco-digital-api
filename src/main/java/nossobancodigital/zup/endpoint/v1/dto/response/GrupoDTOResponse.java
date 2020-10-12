package nossobancodigital.zup.endpoint.v1.dto.response;

import org.springframework.hateoas.RepresentationModel;

public class GrupoDTOResponse extends RepresentationModel<GrupoDTOResponse>{
	
	private Long id;	
	private String nome;
	
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

}
