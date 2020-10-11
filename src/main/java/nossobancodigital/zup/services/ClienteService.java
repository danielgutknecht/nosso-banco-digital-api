package nossobancodigital.zup.services;

import java.util.List;
import nossobancodigital.zup.entities.Cliente;


public interface ClienteService {
	
	public Cliente salvar(Cliente novoCliente);
	
	public Cliente buscarPorId(Long id);
	
	public Cliente buscarPorCpf(String cpf);
	
	public List<Cliente> listarClientes();
	
	public Cliente atualizar(Cliente cliente);
	
	public Cliente autorizarProposta(String cpf);
	
	public Cliente negarProposta(String cpf);

}
