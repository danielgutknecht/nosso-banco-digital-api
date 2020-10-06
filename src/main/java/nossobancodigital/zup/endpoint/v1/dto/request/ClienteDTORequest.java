package nossobancodigital.zup.endpoint.v1.dto.request;

import java.time.LocalDate;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.hateoas.RepresentationModel;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ClienteDTORequest {

	//@NotEmpty(message = "Nome não pode ser vazio.")
	private String nome;
	//@NotEmpty(message = "Sobrenome não pode ser vazio.")
	private String sobrenome;
	//@Email (message = "Email não pode ser vazio.")
	private String email;
	private Integer cnh;
	//@NotEmpty(message = "Data de nascimento não pode ser vazio.")
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate dataNascimento;

	
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

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

}
