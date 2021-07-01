package br.unicamp.mc851.evisita.oapisrvpacientes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class OapiSrvPacientesApplication {

	public static void main(String[] args) {
		SpringApplication.run(OapiSrvPacientesApplication.class, args);
	}

}
