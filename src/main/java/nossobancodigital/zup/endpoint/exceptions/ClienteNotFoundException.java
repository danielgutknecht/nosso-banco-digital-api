package nossobancodigital.zup.endpoint.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Cliente não foi encontrado.")
public class ClienteNotFoundException extends EntityNotFoundException {
	
	private static final long serialVersionUID = 1L;

	public ClienteNotFoundException(String message) {
		super(message);
	}

	public ClienteNotFoundException(Long id) {
		this(String.format("Cliente com ID: %d não existe ", id));
	}

}
