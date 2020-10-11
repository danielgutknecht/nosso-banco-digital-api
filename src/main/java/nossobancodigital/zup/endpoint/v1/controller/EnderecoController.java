package nossobancodigital.zup.endpoint.v1.controller;

import java.sql.SQLException;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import nossobancodigital.zup.endpoint.exceptions.BusinessException;
import nossobancodigital.zup.endpoint.exceptions.ClienteNotFoundException;
import nossobancodigital.zup.endpoint.v1.dto.request.EnderecoDTORequest;
import nossobancodigital.zup.endpoint.v1.dto.response.EnderecoDTOResponse;
import nossobancodigital.zup.endpoint.v1.mapper.EnderecoMapper;
import nossobancodigital.zup.entities.Endereco;
import nossobancodigital.zup.services.EnderecoService;

@RequestMapping("/api/v1/enderecos")
@CrossOrigin(origins = "*")
@RestController
public class EnderecoController {

	@Autowired
	private EnderecoService enderecoService;

	@Autowired
	private EnderecoMapper enderecoMapper;

	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public EnderecoDTOResponse salvar(@RequestBody @Valid EnderecoDTORequest enderecoDTORequest) throws SQLException {
		try {
			Endereco endereco = enderecoMapper.toDomain(enderecoDTORequest);

			return enderecoMapper.toModel(enderecoService.salvar(endereco));

		} catch (ClienteNotFoundException ex) {
			
			throw new BusinessException(ex.getMessage(), ex);
		}

	}

}
