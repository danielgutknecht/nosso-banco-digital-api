package nossobancodigital.zup.services;

import java.util.List;

import nossobancodigital.zup.entities.Endereco;

public interface EnderecoService {

	public Endereco salvar(Endereco novoEndereco);
	
	public List<Endereco> verificaEnderecoDoCliente(Long clienteId);
	
	public List<Endereco> listarEnderecos();
	
}
