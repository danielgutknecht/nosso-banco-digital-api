package nossobancodigital.zup.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nossobancodigital.zup.entities.Cliente;
import nossobancodigital.zup.repositories.ClienteRepository;

@Service
public class ClienteServiceImplement implements ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	

	@Override
	public Cliente salvar(Cliente cliente) {
		return clienteRepository.saveAndFlush(cliente);
	}
	
	
	

}
