package com.formacion.springboot.app.usuarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({"com.formacion.springboot.app.commons.usuarios.models.entity"})
public class SpringBootUsuariosApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootUsuariosApplication.class, args);
	}

}
