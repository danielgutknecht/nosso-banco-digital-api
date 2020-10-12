package nossobancodigital.zup.email;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;


@Validated
@Component
@ConfigurationProperties("nosso-banco-zup.email")
public class EmailProperties {

	private Implementacao impl = Implementacao.FAKE;
	
	//@NotNull
	private String remetente;
	
	private Sandbox sandbox = new Sandbox();
	
	public enum Implementacao {
		SMTP, FAKE, SANDBOX
	}
	
	
	public class Sandbox {
		
		private String destinatario;
		
		public String getDestinatario() {
			return destinatario;
		}

		public void setDestinatario(String destinatario) {
			this.destinatario = destinatario;
		}
		
	}

	public Implementacao getImpl() {
		return impl;
	}

	public void setImpl(Implementacao impl) {
		this.impl = impl;
	}

	public String getRemetente() {
		return remetente;
	}

	public void setRemetente(String remetente) {
		this.remetente = remetente;
	}

	public Sandbox getSandbox() {
		return sandbox;
	}

	public void setSandbox(Sandbox sandbox) {
		this.sandbox = sandbox;
	}
			
}
