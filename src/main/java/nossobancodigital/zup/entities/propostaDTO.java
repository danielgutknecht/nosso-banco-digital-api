package nossobancodigital.zup.entities;

import java.time.LocalDate;
import java.util.Date;

import nossobancodigital.zup.enums.StatusEnum;

public class propostaDTO {
	
	private Long id;
	private String nome;
	private String sobrenome;
	private String email;
	private Integer cnh;
	private LocalDate dataNascimento;
	private StatusEnum status;
	
	
	private Integer cep;
	private String rua;
	private String bairro;
	private String complemento;
	private String cidade;
	private String estado;

}
