package com.nadia.entreprises;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import com.nadia.entreprises.service.EntrepriseService;

@SpringBootApplication
public class EntreprisesApplication implements CommandLineRunner{
	
	@Autowired
	EntrepriseService entrepriseService;
	public static void main(String[] args) {
		SpringApplication.run(EntreprisesApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}
}
