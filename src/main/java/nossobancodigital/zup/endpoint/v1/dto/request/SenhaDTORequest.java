package nossobancodigital.zup.endpoint.v1.dto.request;

import javax.validation.constraints.NotNull;

public class SenhaDTORequest {
	
	@NotNull
	private String senhaAtual;
	@NotNull
	private String novaSenha;
	
	public String getSenhaAtual() {
		return senhaAtual;
	}
	public void setSenhaAtual(String senhaAtual) {
		this.senhaAtual = senhaAtual;
	}
	public String getNovaSenha() {
		return novaSenha;
	}
	public void setNovaSenha(String novaSenha) {
		this.novaSenha = novaSenha;
	}
	
}
