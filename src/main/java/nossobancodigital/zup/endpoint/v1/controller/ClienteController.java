package nossobancodigital.zup.endpoint.v1.controller;


import javax.management.RuntimeErrorException;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import nossobancodigital.zup.endpoint.v1.dto.request.ClienteDTORequest;
import nossobancodigital.zup.endpoint.v1.dto.response.ClienteDTOResponse;
import nossobancodigital.zup.endpoint.v1.mapper.ClienteMapper;
import nossobancodigital.zup.entities.Cliente;
import nossobancodigital.zup.services.ClienteService;


@RequestMapping({"/api/v1/clientes"})
//@RequestMapping(path = "/api/v1/clientes", produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin(origins = "*")
@RestController
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	@Autowired
	private ClienteMapper clienteMapper;
		
	
	@PostMapping
	public ClienteDTOResponse salvar(@RequestBody @Valid ClienteDTORequest clienteDTO) {
		try {
			Cliente cliente = clienteMapper.toDomain(clienteDTO);
			
			return clienteMapper.toModel(clienteService.salvar(cliente));
			
		} catch (Error erro) {
			throw new RuntimeErrorException(erro, "Não foi posssível salvar o cliente");
		}
		
	}

}
