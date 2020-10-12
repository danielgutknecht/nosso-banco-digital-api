package nossobancodigital.zup.endpoint.v1.controller;

import java.io.IOException;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import nossobancodigital.zup.endpoint.exceptions.BusinessException;
import nossobancodigital.zup.endpoint.exceptions.ClienteNotFoundException;
import nossobancodigital.zup.endpoint.v1.dto.request.DocumentoDTORequest;
import nossobancodigital.zup.endpoint.v1.dto.response.DocumentoDTOResponse;
import nossobancodigital.zup.endpoint.v1.mapper.DocumentoMapper;
import nossobancodigital.zup.services.DocumentoService;
import nossobancodigital.zup.services.EnderecoService;


@RequestMapping("/api/v1/documentos")
@RestController
public class DocumentoController {

	@Autowired
	private DocumentoService documentoService;

	@Autowired
	private DocumentoMapper documentoMapper;
	
	@Autowired
	private EnderecoService enderecoService;

	
	@PostMapping("/{clienteId}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public DocumentoDTOResponse documentoUpload(@PathVariable Long clienteId, @Valid DocumentoDTORequest documentoDTORequest) throws IOException {
		try {
			
			enderecoService.verificaEnderecoDoCliente(clienteId);
										
			MultipartFile documentoFrente = documentoDTORequest.getDocumentoFrente();
													
			return documentoMapper.toModel(documentoService.salvar(documentoFrente, clienteId));

		} catch (ClienteNotFoundException ex) {
			throw new BusinessException(ex.getMessage(), ex);
		}
	}
}