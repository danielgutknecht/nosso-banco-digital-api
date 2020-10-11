package nossobancodigital.zup.endpoint.v1.controller;


import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import nossobancodigital.zup.endpoint.exceptions.BusinessException;
import nossobancodigital.zup.endpoint.v1.dto.request.ClienteDTORequest;
import nossobancodigital.zup.endpoint.v1.dto.response.ClienteDTOResponse;
import nossobancodigital.zup.endpoint.v1.mapper.ClienteMapper;
import nossobancodigital.zup.entities.Cliente;
import nossobancodigital.zup.services.ClienteService;

@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/clientes")
@RestController
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	@Autowired
	private ClienteMapper clienteMapper;
		
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public ClienteDTOResponse salvar(@RequestBody @Valid ClienteDTORequest enderecoDTORequest) {
		try {
			Cliente cliente = clienteMapper.toDomain(enderecoDTORequest);
			
			return clienteMapper.toModel(clienteService.salvar(cliente));
			
		} catch (Error erro) {
			
			throw new BusinessException(erro.getMessage(), erro);
		}
		
	}	

}
