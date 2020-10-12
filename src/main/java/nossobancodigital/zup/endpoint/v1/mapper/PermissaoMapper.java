package nossobancodigital.zup.endpoint.v1.mapper;

import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;
import org.springframework.stereotype.Component;
import nossobancodigital.zup.endpoint.v1.controller.PermissaoController;
import nossobancodigital.zup.endpoint.v1.dto.response.PermissaoDTOResponse;
import nossobancodigital.zup.entities.Permissao;

@Component
public class PermissaoMapper extends RepresentationModelAssemblerSupport<Permissao, PermissaoDTOResponse>{

	public PermissaoMapper() {
		super(PermissaoController.class, PermissaoDTOResponse.class);
	}

	@Override
	public PermissaoDTOResponse toModel(Permissao permissao) {
		PermissaoDTOResponse permissaoDTOResponse = new PermissaoDTOResponse();
		permissaoDTOResponse.setNome(permissao.getNome());
		permissaoDTOResponse.setDescricao(permissao.getDescricao());
		
		
		return permissaoDTOResponse;
	}
	
	public CollectionModel<PermissaoDTOResponse> toCollectionModel(Iterable<? extends Permissao> permissao){
		CollectionModel<PermissaoDTOResponse> permissaoModel = super.toCollectionModel(permissao);
		
		return permissaoModel;
	}

}
