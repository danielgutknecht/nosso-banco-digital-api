package nossobancodigital.zup.endpoint.v1.dto.request;

public class UsuarioComSenhaDTORequest extends SenhaDTORequest {
	
	private String senha;

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
