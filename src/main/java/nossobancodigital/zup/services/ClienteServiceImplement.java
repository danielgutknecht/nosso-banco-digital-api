package nossobancodigital.zup.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import nossobancodigital.zup.endpoint.exceptions.ClienteNotFoundException;
import nossobancodigital.zup.entities.Cliente;
import nossobancodigital.zup.repositories.ClienteRepository;

@Service
public class ClienteServiceImplement implements ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;

	@Override
	public Cliente salvar(Cliente novoCliente) {

		Boolean cliente = clienteRepository.existsByCpf(novoCliente.getCpf());
		if (cliente == true) {
			throw new ClienteNotFoundException("Existe um cliente já cadastrado com esse CPF");
		} else {
			return clienteRepository.saveAndFlush(novoCliente);

		}
	}

	@Override
	public Cliente buscarPorId(Long id) {

		Optional<Cliente> cliente = clienteRepository.findById(id);

		return cliente.orElseThrow(() -> new ClienteNotFoundException(id));

	}

	public Cliente buscarPorCpf(String cpf) {

		Cliente cliente = clienteRepository.findByCpf(cpf);

		if (cliente == null) {
			throw new ClienteNotFoundException("Cpf não encontrado.");
		} else {
			return cliente;
		}
	}

	public List<Cliente> listarClientes() {

		return clienteRepository.findAll();
	}

	public Cliente atualizar(Cliente cliente) {

		return clienteRepository.save(cliente);
	}

	public Cliente autorizarProposta(String cpf) {

		Cliente cliente = buscarPorCpf(cpf);
		cliente.autorizar();

		return clienteRepository.save(cliente);
	}

	public Cliente negarProposta(String cpf) {

		Cliente cliente = buscarPorCpf(cpf);
		cliente.negar();

		return clienteRepository.save(cliente);
	}

}
