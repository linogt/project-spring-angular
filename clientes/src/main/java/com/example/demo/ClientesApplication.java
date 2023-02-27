package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.model.entity.Cliente;
import com.example.demo.model.repository.ClienteRepository;

@SpringBootApplication
public class ClientesApplication {
	
	@Bean
	public CommandLineRunner run(@Autowired ClienteRepository repository) {
		return args->{
			Cliente cliente = Cliente.builder()
										.cpf("11436057051")
										.nome("Fulano")
										.build();
			repository.save(cliente);
			
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(ClientesApplication.class, args);
	}

}
