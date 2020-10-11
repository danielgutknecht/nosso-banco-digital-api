package nossobancodigital.zup.entities;

import java.time.LocalDate;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import nossobancodigital.zup.enums.StatusEnum;

@Entity
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	private String sobrenome;
	private String email;
	private String cpf;
	private LocalDate dataNascimento;

	@Enumerated(EnumType.STRING)
	@Column(name = "status", nullable = true)
	private StatusEnum status;

	@OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<Endereco> endereco;

	@OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<Documento> imagem;

	public Cliente() {

	}

	public Cliente(Long id, String nome, String sobrenome, String email, String cpf, Integer cnh,
			LocalDate dataNascimento, StatusEnum status, Set<Endereco> endereco, Set<Documento> imagem) {
		super();
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.status = status;
		this.endereco = endereco;
		this.imagem = imagem;
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "cpf", unique = true)
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

	public StatusEnum getStatus() {
		return status;
	}

	public void setStatus(StatusEnum status) {
		this.status = status;
	}

	public Set<Endereco> getEndereco() {
		return endereco;
	}

	public void setEndereco(Set<Endereco> endereco) {
		this.endereco = endereco;
	}

	public Set<Documento> getImagem() {
		return imagem;
	}

	public void setImagem(Set<Documento> imagem) {
		this.imagem = imagem;
	}
	
	public void autorizar() {
		setStatus(StatusEnum.ACEITO);
	}
	
	public void negar() {
		setStatus(StatusEnum.NEGADO);
	}


}
