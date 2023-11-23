package med.voll.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class ApiApplication {

	public String PORT = System.getenv("PORT");
	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);

	}

}
