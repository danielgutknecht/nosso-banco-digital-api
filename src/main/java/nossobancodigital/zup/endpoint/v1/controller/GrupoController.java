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
import nossobancodigital.zup.endpoint.v1.dto.request.GrupoDTORequest;
import nossobancodigital.zup.endpoint.v1.dto.response.GrupoDTOResponse;
import nossobancodigital.zup.endpoint.v1.mapper.GrupoMapper;
import nossobancodigital.zup.entities.Grupo;
import nossobancodigital.zup.services.GrupoService;

@RequestMapping("/api/v1/grupos")
@RestController
public class GrupoController {

	@Autowired
	private GrupoService grupoService;

	@Autowired
	private GrupoMapper grupoMapper;

	@GetMapping
	public CollectionModel<GrupoDTOResponse> listarTodos() {
		return grupoMapper.toCollection(grupoService.listarTodos());
	}

	@GetMapping("/{grupoId}")
	public GrupoDTOResponse buscar(@PathVariable Long grupoId) {
		Grupo grupo = grupoService.buscarOuFalhar(grupoId);

		return grupoMapper.toModel(grupo);
	}

	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public GrupoDTOResponse adicionar(@RequestBody @Valid GrupoDTORequest grupoDTORequest) {
		Grupo grupo = grupoMapper.toDomain(grupoDTORequest);

		return grupoMapper.toModel(grupoService.salvar(grupo));
	}

	@PutMapping("/{grupoId}")
	public GrupoDTOResponse atualizar(@PathVariable Long grupoId, @RequestBody @Valid GrupoDTORequest grupoDTORequest) {
		Grupo grupoAtual = grupoService.buscarOuFalhar(grupoId);

		grupoMapper.copyToDomainObject(grupoDTORequest, grupoAtual);

		return grupoMapper.toModel(grupoService.salvar(grupoAtual));
	}
	
	@DeleteMapping("/{grupoId}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void remover(@PathVariable Long grupoId) {
		grupoService.excluir(grupoId);
	}
	
}
