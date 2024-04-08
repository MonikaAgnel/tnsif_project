package com.tnsif.userservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserService {
	@Autowired
private UserRepository repo;
	
	public List<User> listAll(){
		return repo.findAll();
	}
	public void save(User User) {
		repo.save(User);
		}
}
