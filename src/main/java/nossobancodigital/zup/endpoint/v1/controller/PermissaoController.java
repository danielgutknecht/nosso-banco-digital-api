package nossobancodigital.zup.endpoint.v1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import nossobancodigital.zup.endpoint.v1.dto.response.PermissaoDTOResponse;
import nossobancodigital.zup.endpoint.v1.mapper.PermissaoMapper;
import nossobancodigital.zup.services.PermissaoService;

@RequestMapping("/api/v1/permissoes")
@RestController
public class PermissaoController {
	
	@Autowired
	private PermissaoService permissaoService;
	
	@Autowired
	private PermissaoMapper permissaoMapper;
	
	public CollectionModel<PermissaoDTOResponse> listar() {
				
		return permissaoMapper.toCollectionModel(permissaoService.ListarTodas());
	}

}
