package nossobancodigital.zup.endpoint.v1.mapper;

import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;
import org.springframework.stereotype.Component;
import nossobancodigital.zup.endpoint.v1.controller.ClienteController;
import nossobancodigital.zup.endpoint.v1.dto.request.ClienteDTORequest;
import nossobancodigital.zup.endpoint.v1.dto.response.ClienteDTOResponse;
import nossobancodigital.zup.entities.Cliente;

@Component
public class ClienteMapper extends RepresentationModelAssemblerSupport<Cliente, ClienteDTOResponse> {
	
	public ClienteMapper() {
		super(ClienteController.class, ClienteDTOResponse.class);
	}

	@Override
	public ClienteDTOResponse toModel(Cliente cliente) {
		ClienteDTOResponse clienteDTO = createModelWithId(cliente.getId(), cliente);
		clienteDTO.setId(cliente.getId());
		clienteDTO.setNome(cliente.getNome());
		clienteDTO.setSobrenome(cliente.getSobrenome());
		clienteDTO.setEmail(cliente.getEmail());
		clienteDTO.setCnh(cliente.getCnh());
		clienteDTO.setDataDeNascimento(cliente.getDataNascimento());
		
		return clienteDTO;
	}
	
	public Cliente toDomain(ClienteDTORequest clienteDTO) {
		Cliente cliente = new Cliente();
		cliente.setNome(clienteDTO.getNome());
		cliente.setSobrenome(clienteDTO.getSobrenome());
		cliente.setEmail(clienteDTO.getEmail());
		cliente.setCnh(clienteDTO.getCnh());
		cliente.setDataNascimento(clienteDTO.getDataNascimento());
		
		return cliente;
	}
	
	public CollectionModel<ClienteDTOResponse> toCollectionModel(Iterable<? extends Cliente> cliente){
		CollectionModel<ClienteDTOResponse> clienteModel = super.toCollectionModel(cliente);
		
		return clienteModel;
	}
}
