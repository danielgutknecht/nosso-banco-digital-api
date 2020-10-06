package nossobancodigital.zup.endpoint.v1.mapper;

import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;
import org.springframework.stereotype.Component;

import nossobancodigital.zup.endpoint.v1.dto.request.EnderecoDTORequest;
import nossobancodigital.zup.endpoint.v1.dto.response.EnderecoDTOResponse;
import nossobancodigital.zup.entities.Endereco;

@Component
public class EnderecoMapper extends RepresentationModelAssemblerSupport<Endereco, EnderecoDTOResponse> {

	public EnderecoMapper() {
		super(Endereco.class, EnderecoDTOResponse.class);
	}

	@Override
	public EnderecoDTOResponse toModel(Endereco endereco) {
		EnderecoDTOResponse enderecoDTO = createModelWithId(endereco.getId(), endereco);
		enderecoDTO.setCep(endereco.getCep());
		enderecoDTO.setRua(endereco.getRua());
		enderecoDTO.setBairro(endereco.getBairro());
		enderecoDTO.setComplemento(endereco.getComplemento());
		enderecoDTO.setCidade(endereco.getCidade());
		enderecoDTO.setEstado(endereco.getEstado());
		
		return enderecoDTO;
	}
	
	public Endereco toDomain(EnderecoDTORequest enderecoDTO) {
		Endereco endereco = new Endereco();
		endereco.setCep(enderecoDTO.getCep());
		endereco.setRua(enderecoDTO.getRua());
		endereco.setBairro(enderecoDTO.getBairro());
		endereco.setComplemento(enderecoDTO.getComplemento());
		endereco.setCidade(enderecoDTO.getCidade());
		endereco.setEstado(enderecoDTO.getEstado());
		
		return endereco;
	}
	
	public CollectionModel<EnderecoDTOResponse> toCollectionModel(Iterable<? extends Endereco> endereco){
		CollectionModel<EnderecoDTOResponse> enderecoModel = super.toCollectionModel(endereco);
		
		return enderecoModel;
	}

}
