package nossobancodigital.zup.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
public class ImageFile {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String type;	
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Cliente cliente;
	
	@Lob
	private byte[] fotoFrenteCNH;

	@Lob
	private byte[] fotoVersoCNH;

	public ImageFile(Long id, String name, String type, Cliente cliente, byte[] fotoFrenteCNH, byte[] fotoVersoCNH) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.cliente = cliente;
		this.fotoFrenteCNH = fotoFrenteCNH;
		this.fotoVersoCNH = fotoVersoCNH;
	}
	//contrutor modificado para receber as imagens.
	public ImageFile(String name, String type, byte[] fotoFrenteCNH, byte[] fotoVersoCNH) {
		this.name = name;
		this.type = type;
		this.fotoFrenteCNH = fotoFrenteCNH;
		this.fotoVersoCNH = fotoVersoCNH;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public byte[] getFotoFrenteCNH() {
		return fotoFrenteCNH;
	}

	public void setFotoFrenteCNH(byte[] fotoFrenteCNH) {
		this.fotoFrenteCNH = fotoFrenteCNH;
	}

	public byte[] getFotoVersoCNH() {
		return fotoVersoCNH;
	}

	public void setFotoVersoCNH(byte[] fotoVersoCNH) {
		this.fotoVersoCNH = fotoVersoCNH;
	}
	
}
