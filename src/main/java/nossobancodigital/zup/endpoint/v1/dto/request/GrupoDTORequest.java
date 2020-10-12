package nossobancodigital.zup.endpoint.v1.dto.request;

import javax.validation.constraints.NotNull;

public class GrupoDTORequest {
	
	@NotNull
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
