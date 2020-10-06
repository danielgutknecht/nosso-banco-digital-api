package nossobancodigital.zup.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Conta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String agencia;
	private Integer conta;
	private Integer banco;
	private Double saldo;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Cliente cliente;

	public Conta(String agencia, Integer conta, Integer banco, Double saldo, Cliente cliente) {
		super();
		this.agencia = agencia;
		this.conta = conta;
		this.banco = banco;
		this.saldo = saldo;
		this.cliente = cliente;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public Integer getConta() {
		return conta;
	}

	public void setConta(Integer conta) {
		this.conta = conta;
	}

	public Integer getBanco() {
		return banco;
	}

	public void setBanco(Integer banco) {
		this.banco = banco;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}	

}
