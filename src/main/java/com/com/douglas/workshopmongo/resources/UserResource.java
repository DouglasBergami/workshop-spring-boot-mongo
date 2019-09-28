package com.com.douglas.workshopmongo.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.com.douglas.workshopmongo.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<List<User>> findall() {

		User u1 = new User("1", "Maria", "maria@gmail.com");
		User u2 = new User("2", "João", "joão@gmail.com");
		List<User> listUser = Arrays.asList(u1, u2);

		return ResponseEntity.ok().body(listUser);

	}

}
