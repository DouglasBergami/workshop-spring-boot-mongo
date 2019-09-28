package com.douglas.workshopmongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.douglas.workshopmongo.domain.User;
import com.douglas.workshopmongo.repositories.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		userRepository.deleteAll();

		User u1 = new User(null, "maria", "maria@gmail.com");
		User u2 = new User(null, "joão", "joao@gmail.com");

		userRepository.saveAll(Arrays.asList(u1, u2));

	}

}
