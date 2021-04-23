package com.example.demo.services;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import com.example.demo.model.Users;
import com.example.demo.repositories.UsersRepository;

@Service
public class UsersService {

	@Autowired
	private UsersRepository uRepo;

	// register user and hash their password
	public Users registerUser(Users user) {
		String hashed = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
		user.setPassword(hashed);
		return uRepo.save(user);
	}

	// find user by email
	public Users findByEmail(String email) {
		return uRepo.findByEmail(email);
	}

	// find user by id
	public Users findUserById(Long id) {
		Users u = uRepo.findById(id).orElse(null);
		return u;
	}

	// authenticate user
	public boolean authenticateUser(String email, String password) {

		// first find the user by email
		Users user = uRepo.findByEmail(email);

		if (BCrypt.checkpw(password, user.getPassword())) {
			return true;
		} else {
			return false;
		}
	}

}
