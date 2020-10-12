package nossobancodigital.zup.endpoint.v1.mapper;

import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;
import org.springframework.stereotype.Component;

import nossobancodigital.zup.endpoint.v1.controller.UsuarioController;
import nossobancodigital.zup.endpoint.v1.dto.request.UsuarioDTORequest;
import nossobancodigital.zup.endpoint.v1.dto.response.UsuarioDTOResponse;
import nossobancodigital.zup.entities.Usuario;

@Component
public class UsuarioMapper extends RepresentationModelAssemblerSupport<Usuario, UsuarioDTOResponse>{

	public UsuarioMapper() {
		super(UsuarioController.class, UsuarioDTOResponse.class);
	}

	@Override
	public UsuarioDTOResponse toModel(Usuario usuario) {
		UsuarioDTOResponse usuarioDTOResponse = new UsuarioDTOResponse();
		usuarioDTOResponse.setNome(usuario.getNome());
		usuarioDTOResponse.setEmail(usuario.getEmail());
		
		return usuarioDTOResponse;
	}
	
	public Usuario toDomain(UsuarioDTORequest usuarioDTORequest) {
		Usuario usuario = new Usuario();
		usuario.setNome(usuarioDTORequest.getNome());
		usuario.setEmail(usuarioDTORequest.getEmail());
		
		return usuario;
	}
	
	public CollectionModel<UsuarioDTOResponse> toCollection(Iterable<? extends Usuario> usuario){
		CollectionModel<UsuarioDTOResponse> usuarioModel = super.toCollectionModel(usuario);
		
		return usuarioModel;
		
	}
	
	public Usuario copyToDomainObject(UsuarioDTORequest usuarioDTORequest, Usuario usuario) {
		usuario.setNome(usuarioDTORequest.getNome());
		usuario.setEmail(usuarioDTORequest.getEmail());
		
		return usuario;
	}
	

}
