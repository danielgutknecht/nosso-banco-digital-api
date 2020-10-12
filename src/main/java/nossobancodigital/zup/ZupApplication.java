package nossobancodigital.zup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


// Segurança desabilitada --> (exclude = {SecurityAutoConfiguration.class })
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class ZupApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZupApplication.class, args);
	}

}
