package br.com.cadastro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import configuration.JpaConfiguration;
 
 
@Import(JpaConfiguration.class)
@SpringBootApplication(scanBasePackages={"br.com.cadastro"})
public class ApplicationCadastro {
	
	public static void main(String[] args) {
        SpringApplication.run(ApplicationCadastro.class, args);
    }

}
