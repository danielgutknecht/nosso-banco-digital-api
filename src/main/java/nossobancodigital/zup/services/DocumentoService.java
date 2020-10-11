package nossobancodigital.zup.services;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

import nossobancodigital.zup.entities.Documento;

public interface DocumentoService {
	
	public Documento salvar(MultipartFile file, Long id) throws IOException;
	
	
}
