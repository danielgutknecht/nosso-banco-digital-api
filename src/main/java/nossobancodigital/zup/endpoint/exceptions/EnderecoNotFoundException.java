package nossobancodigital.zup.endpoint.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Endereco não foi encontrado.")
public class EnderecoNotFoundException extends EntityNotFoundException {

	private static final long serialVersionUID = 1L;

	public EnderecoNotFoundException(String message) {
		super(message);
	}

	public EnderecoNotFoundException(Long id) {
		this(String.format("Endereco com ID: %d não existe ", id));
	}

}
