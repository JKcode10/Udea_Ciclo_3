package com.Udea.ciclo3;

import com.Udea.ciclo3.Entidades.Empresa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication (exclude ={SecurityAutoConfiguration.class})
public class Ciclo3Application {
	
	@GetMapping("/hello")
	public String hello(){
		return "hola ciclo 3..... saldremos vivos de esto :)";
	}

	@GetMapping("/test")
	public String test(){
		Empresa empresa = new Empresa("BanTic","calle la jeta","32245535553","12453255333");
		empresa.setNombre("Crews Bank");
		return empresa.getNombre();


	}
	public static void main(String[] args) {
		SpringApplication.run(Ciclo3Application.class, args);
	}

}
