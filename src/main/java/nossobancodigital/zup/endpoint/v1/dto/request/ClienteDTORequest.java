package nossobancodigital.zup.endpoint.v1.dto.request;

import java.time.LocalDate;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CPF;
import com.fasterxml.jackson.annotation.JsonFormat;

public class ClienteDTORequest {

	@NotEmpty(message = "Nome não pode ser vazio.")
	@Length(min = 3, max = 200, message = "Nome deve conter entre 3 e 200 caracteres.")
	private String nome;
	@Length(min = 3, max = 200, message = "Sobrenome deve conter entre 3 e 200 caracteres.")
	@NotEmpty(message = "Sobrenome não pode ser vazio.")
	private String sobrenome;
	@Length(min = 3, max = 200, message = "E-mail deve ter entre 3 e 200 caracters.")
	@Email(message = "E-mail inválido. ")
	private String email;
	@CPF(message = "CPF inválido.")
	private String cpf;
	@NotNull(message = "Data não pode ser vazia.")
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

}
