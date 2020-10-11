package nossobancodigital.zup.services;

import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import nossobancodigital.zup.entities.Cliente;
import nossobancodigital.zup.entities.Documento;
import nossobancodigital.zup.repositories.DocumentoRepository;

@Service
public class DocumentServiceImplement implements DocumentoService {

	@Autowired
	private DocumentoRepository documentRepository;

	@Autowired
	private ClienteService clienteService;
	

	@Override
	public Documento salvar(MultipartFile arquivo, Long id) throws IOException {

		Cliente cliente = new Cliente();		
		cliente = clienteService.buscarPorId(id);
		
		Documento documento = new Documento();
		documento.setDocumentoFrente(arquivo.getBytes());
		documento.setNome(arquivo.getOriginalFilename());
		documento.setTipo(arquivo.getContentType());
		documento.setCliente(cliente);		
		
		return documentRepository.save(documento);
	}
	
}
