package nossobancodigital.zup.endpoint.v1.dto.response;

import java.time.LocalDate;

import org.springframework.hateoas.RepresentationModel;

public class ClienteDTOResponse extends RepresentationModel<ClienteDTOResponse> {

	private Long id;
	private String nome;
	private String sobrenome;
	private String cpf;
	private String email;
	private Integer cnh;
	private LocalDate dataDeNascimento;

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

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getCnh() {
		return cnh;
	}

	public void setCnh(Integer cnh) {
		this.cnh = cnh;
	}

	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

}
