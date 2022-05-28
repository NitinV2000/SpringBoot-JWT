package com.tintin.springjwt;

import java.util.ArrayList;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.tintin.springjwt.model.ERole;
import com.tintin.springjwt.model.Role;
import com.tintin.springjwt.repository.RoleRepository;

@SpringBootApplication
public class SpringBootSecurityJwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityJwtApplication.class, args);
	}
	
	@Bean
	CommandLineRunner run(RoleRepository roleRepository) {
		return args -> {
			
			roleRepository.save(new Role(ERole.ROLE_ADMIN));
			roleRepository.save(new Role(ERole.ROLE_USER));
			roleRepository.save(new Role(ERole.ROLE_MODERATOR));
		};
	}
}
