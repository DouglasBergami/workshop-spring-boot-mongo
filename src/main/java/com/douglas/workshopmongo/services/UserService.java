package com.douglas.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.douglas.workshopmongo.domain.User;
import com.douglas.workshopmongo.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	public List<User> listAdll() {
		List<User> listUser = userRepository.findAll();

		return listUser;
	}
}
