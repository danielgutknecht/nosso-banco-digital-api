package nossobancodigital.zup.endpoint.v1.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import nossobancodigital.zup.endpoint.v1.dto.request.SenhaDTORequest;
import nossobancodigital.zup.endpoint.v1.dto.request.UsuarioDTORequest;
import nossobancodigital.zup.endpoint.v1.dto.response.UsuarioDTOResponse;
import nossobancodigital.zup.endpoint.v1.mapper.UsuarioMapper;
import nossobancodigital.zup.entities.Usuario;
import nossobancodigital.zup.services.UsuarioService;

@RequestMapping("/api/v1/usuarios")
@RestController
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired
	private UsuarioMapper usuarioMapper;
	
	@GetMapping
	public CollectionModel<UsuarioDTOResponse> listar(){
		return usuarioMapper.toCollection(usuarioService.listarTodos());
	}
	
	@GetMapping("/{usuarioId}")
	public UsuarioDTOResponse buscar(@PathVariable Long usuarioId) {
		Usuario usuario = usuarioService.buscarOuFalhar(usuarioId);
		
		return usuarioMapper.toModel(usuario);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public UsuarioDTOResponse adicionar(@RequestBody @Valid UsuarioDTORequest usuarioDTORequest) {
		Usuario usuario = usuarioMapper.toDomain(usuarioDTORequest);
		
		return usuarioMapper.toModel(usuarioService.salvar(usuario));
	}
	
	@PutMapping("/{usuarioId}")
	public UsuarioDTOResponse atualizar(@PathVariable Long usuarioId, @RequestBody @Valid UsuarioDTORequest usuarioDTORequest) {
		Usuario usuarioAtual = usuarioService.buscarOuFalhar(usuarioId);
		
		usuarioMapper.copyToDomainObject(usuarioDTORequest, usuarioAtual);
		
		return usuarioMapper.toModel(usuarioService.salvar(usuarioAtual));
		
	}
	
	@DeleteMapping("/{grupoId}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void alterarSenha(@PathVariable Long usuarioId, @RequestBody @Valid SenhaDTORequest senhaDTORequest) {
		usuarioService.alterarSenha(usuarioId, senhaDTORequest.getSenhaAtual(), senhaDTORequest.getNovaSenha());
	}
}
