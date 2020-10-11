package nossobancodigital.zup.endpoint.v1.mapper;

import java.io.IOException;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import nossobancodigital.zup.endpoint.v1.controller.DocumentoController;
import nossobancodigital.zup.endpoint.v1.dto.response.DocumentoDTOResponse;
import nossobancodigital.zup.entities.Documento;

@Component
public class DocumentoMapper extends RepresentationModelAssemblerSupport<Documento, DocumentoDTOResponse> {

	public DocumentoMapper() {
		super(DocumentoController.class, DocumentoDTOResponse.class);
	}

	@Override
	public DocumentoDTOResponse toModel(Documento documentoFile) {
		DocumentoDTOResponse documentoDTO = createModelWithId(documentoFile.getId(), documentoFile);
		documentoDTO.setId(documentoFile.getId());
		documentoDTO.setNome(documentoFile.getNome());
		documentoDTO.setTipo(documentoFile.getTipo());

		return documentoDTO;
	}

	public Documento toDomain(MultipartFile documentoFrente) throws IOException {
		Documento documento = new Documento();
		documento.setDocumentoFrente(documentoFrente.getBytes());
		documento.setNome(documentoFrente.getOriginalFilename());
		documento.setTipo(documentoFrente.getContentType());
		

		return documento;
	}

	public CollectionModel<DocumentoDTOResponse> toCollection(Iterable<? extends Documento> documentFile) {
		CollectionModel<DocumentoDTOResponse> documentoFileModel = super.toCollectionModel(documentFile);

		return documentoFileModel;
	}

}
