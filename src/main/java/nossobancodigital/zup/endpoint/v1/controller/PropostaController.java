package nossobancodigital.zup.endpoint.v1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import nossobancodigital.zup.endpoint.v1.dto.response.ClienteDTOResponse;
import nossobancodigital.zup.endpoint.v1.dto.response.PropostaDTO;
import nossobancodigital.zup.endpoint.v1.mapper.ClienteMapper;
import nossobancodigital.zup.endpoint.v1.mapper.PropostaMapper;
import nossobancodigital.zup.services.ClienteService;
import nossobancodigital.zup.services.EnderecoService;

@RequestMapping("/api/v1/propostas")
@RestController
public class PropostaController {

	@Autowired
	private ClienteService clienteService;
	
	@Autowired
	private EnderecoService enderecoService;

	@Autowired
	PropostaMapper propostaMapper;
	
	@Autowired
	ClienteMapper clienteMapper;

	@GetMapping
	public CollectionModel<PropostaDTO> listarTodasPropostas() {
		return propostaMapper.toCollectionModel(enderecoService.listarEnderecos());

	}

	@GetMapping(value = "/{cpf}")
	public ClienteDTOResponse buscarClientePorCPF(@PathVariable String cpf) {
		return clienteMapper.toModel(clienteService.buscarPorCpf(cpf));
	}
	
	
	@PutMapping(value = "/autorizar/{cpf}")
	public ResponseEntity<Void> autorizarPropostaPorCFP(@PathVariable() String cpf) {
		clienteService.autorizarProposta(cpf);
		
		return ResponseEntity.noContent().build();
	}
	
	@PutMapping(value = "/negar/{cpf}")
	public ResponseEntity<Void> negarPropostaPorCFP(@PathVariable() String cpf) {
		clienteService.negarProposta(cpf);
		
		return ResponseEntity.noContent().build();
	}
	
	
	

}
