package nossobancodigital.zup.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
public class Documento {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	private String tipo;
	@Lob
	private byte[] documentoFrente;

	@ManyToOne(fetch = FetchType.LAZY)
	private Cliente cliente;

	public Documento() {

	}

	public Documento(Long id, String nome, String tipo, byte[] documentoFrente, Cliente cliente) {
		super();
		this.id = id;
		this.nome = nome;
		this.tipo = tipo;
		this.documentoFrente = documentoFrente;
		this.cliente = cliente;
	}

	// construtor modificado
	public Documento(String nome, String tipo, byte[] documentoFrente) {
		super();
		this.nome = nome;
		this.tipo = tipo;
		this.documentoFrente = documentoFrente;
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public byte[] getDocumentoFrente() {
		return documentoFrente;
	}

	public void setDocumentoFrente(byte[] documentoFrente) {
		this.documentoFrente = documentoFrente;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
