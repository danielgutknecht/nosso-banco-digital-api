package nossobancodigital.zup.services;

import java.io.IOException;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import nossobancodigital.zup.entities.Cliente;
import nossobancodigital.zup.entities.ImageFile;
import nossobancodigital.zup.repositories.ImageFileRepository;

@Service
public class FileStorageService {

	@Autowired
	private ImageFileRepository imageFileRepository;

	public ImageFile store(MultipartFile file) throws IOException {
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());
		// Cliente cliente = new Cliente(fileName, file.getContentType(),
		// file.getBytes());
		ImageFile imagesFile = new ImageFile(fileName, file.getContentType(), file.getBytes(), file.getBytes());

		return imageFileRepository.save(imagesFile);
	}

}
