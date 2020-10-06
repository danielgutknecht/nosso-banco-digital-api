package nossobancodigital.zup.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Endereco {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Integer cep;
	private String rua;
	private String bairro;
	private String complemento;
	private String cidade;
	private String estado;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Cliente cliente;

	public Endereco(Long id, Integer cep, String rua, String bairro, String complemento, String cidade, String estado,
			Cliente cliente) {
		super();
		this.id = id;
		this.cep = cep;
		this.rua = rua;
		this.bairro = bairro;
		this.complemento = complemento;
		this.cidade = cidade;
		this.estado = estado;
		this.cliente = cliente;
	}

	public Endereco() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
