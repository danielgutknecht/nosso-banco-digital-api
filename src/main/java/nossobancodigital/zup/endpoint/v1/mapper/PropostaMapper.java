package nossobancodigital.zup.endpoint.v1.mapper;

import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;
import org.springframework.stereotype.Component;
import nossobancodigital.zup.endpoint.v1.controller.PropostaController;
import nossobancodigital.zup.endpoint.v1.dto.response.PropostaDTO;
import nossobancodigital.zup.entities.Endereco;


@Component
public class PropostaMapper extends RepresentationModelAssemblerSupport<Endereco, PropostaDTO> {

	public PropostaMapper() {
		super(PropostaController.class, PropostaDTO.class);
	}

	
	
	public CollectionModel<PropostaDTO> toCollectionModel(Iterable<? extends Endereco> endereco){
		CollectionModel<PropostaDTO> clienteModel = super.toCollectionModel(endereco);
		return clienteModel;
	}



	@Override
	public PropostaDTO toModel(Endereco endereco) {
		
		PropostaDTO propostaDTO = new PropostaDTO();
		propostaDTO.setId(endereco.getCliente().getId());
		propostaDTO.setNome(endereco.getCliente().getNome());
		propostaDTO.setSobrenome(endereco.getCliente().getSobrenome());
		propostaDTO.setEmail(endereco.getCliente().getEmail());
		propostaDTO.setCpf(endereco.getCliente().getCpf());
		propostaDTO.setDataNascimento(endereco.getCliente().getDataNascimento());
		propostaDTO.setStatus(endereco.getCliente().getStatus());
		propostaDTO.setEnderecoId(endereco.getId());
		propostaDTO.setCep(endereco.getCep());
		propostaDTO.setRua(endereco.getRua());
		propostaDTO.setBairro(endereco.getBairro());
		propostaDTO.setComplemento(endereco.getComplemento());
		propostaDTO.setCidade(endereco.getCidade());
		propostaDTO.setEstado(endereco.getEstado());
		
		propostaDTO.setCep(endereco.getCep());
		return propostaDTO;
	}
	

}
