package nossobancodigital.zup.email;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class FakeEnvioEmailService extends SmtpEnvioEmailService {
	
	Logger log = LoggerFactory.getLogger(FakeEnvioEmailService.class);

	@Override
	public void enviar(Mensagem mensagem) {
		String corpo = processarTemplate(mensagem);

		log.info("[FAKE E-MAIL] Para: {}\n{}", mensagem.getDestinatarios(), corpo);
	}

}
