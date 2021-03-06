package nossobancodigital.zup.endpoint.v1.dto.request;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class EnderecoDTORequest {

	
	@NotNull(message = "CEP não pode ser vazio")
	private Integer cep;
	@NotEmpty(message = "Rua não pode ser vazio.")
	private String rua;
	@NotEmpty(message = "Bairro não pode ser vazio.")
	private String bairro;
	@NotEmpty(message = "Complemento não pode ser vazio.")
	private String complemento;
	@NotEmpty(message = "Cidade não pode ser vazio.")
	private String cidade;
	@NotEmpty(message = "Estado não pode ser vazio.")
	private String estado;
	@NotNull(message = "ClienteId não pode ser vazio")
	private Long clienteId;

	public Integer getCep() {
		return cep;
	}

	public void setCep(Integer cep) {
		this.cep = cep;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Long getClienteId() {
		return clienteId;
	}

	public void setClienteId(Long clienteId) {
		this.clienteId = clienteId;
	}
	
}
