package nossobancodigital.zup.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nossobancodigital.zup.endpoint.exceptions.BusinessException;
import nossobancodigital.zup.endpoint.exceptions.EnderecoNotFoundException;
import nossobancodigital.zup.entities.Cliente;
import nossobancodigital.zup.entities.Endereco;
import nossobancodigital.zup.repositories.EnderecoRepository;

@Service
public class EnderecoServiceImplement implements EnderecoService {

	@Autowired
	private EnderecoRepository enderecoRepository;

	@Autowired
	private ClienteService clienteService;

	@Override
	public Endereco salvar(Endereco novoEndereco) {

		// Atribui o id do cliente para o endereco.
		Long clienteId = novoEndereco.getCliente().getId();
		// busca o id do cliente no banco de dados.
		Cliente cliente = clienteService.buscarPorId(clienteId);
		// seta o id do cliente ao endereco (fechando o relacionamento).
		novoEndereco.setCliente(cliente);

		return enderecoRepository.save(novoEndereco);
	}

	@Override
	public List<Endereco> verificaEnderecoDoCliente(Long clienteId) {
		try {
			List<Endereco> verificarEnderecoCliente = enderecoRepository.verificaEnderecoCliente(clienteId); 
			
			return verificarEnderecoCliente;
			
		} catch (EnderecoNotFoundException ex) {
			throw new BusinessException("Endereço do cliente não foi encontrado.", ex);
		}		
	}
	
	public List<Endereco> listarEnderecos(){
		
		return enderecoRepository.findAll();
	}

}
