package nossobancodigital.zup.endpoint.v1.mapper;

import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;
import org.springframework.stereotype.Component;

import nossobancodigital.zup.endpoint.v1.controller.GrupoController;
import nossobancodigital.zup.endpoint.v1.dto.request.GrupoDTORequest;
import nossobancodigital.zup.endpoint.v1.dto.response.GrupoDTOResponse;
import nossobancodigital.zup.entities.Grupo;

@Component
public class GrupoMapper extends RepresentationModelAssemblerSupport<Grupo, GrupoDTOResponse> {

	
	
	public GrupoMapper() {
		super(GrupoController.class, GrupoDTOResponse.class);
	
	}

	@Override
	public GrupoDTOResponse toModel(Grupo grupo) {
		GrupoDTOResponse grupoDTOResponse = createModelWithId(grupo.getId(), grupo);
		grupoDTOResponse.setId(grupo.getId());
		grupoDTOResponse.setNome(grupo.getNome());
		
		return grupoDTOResponse;
	}
	
	public Grupo toDomain(GrupoDTORequest grupoDTORequest) {
		Grupo grupo = new Grupo();
		grupo.setNome(grupoDTORequest.getNome());
		
		return grupo;		
	}
	
	public CollectionModel<GrupoDTOResponse> toCollection(Iterable<? extends Grupo> grupo){
		CollectionModel<GrupoDTOResponse> grupoModel = super.toCollectionModel(grupo);
		return grupoModel;
	}
	
	public Grupo copyToDomainObject(GrupoDTORequest grupoDTORequest, Grupo grupo) {
		grupo.setNome(grupoDTORequest.getNome());
		
		return grupo;
	}

}
