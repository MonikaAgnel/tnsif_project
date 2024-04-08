package com.tnsif.userservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
@Autowired
private UserService User;
@GetMapping("/userservice")
public List<User>list(){
	return User.listAll();
}
@PostMapping("/userservice")
public void add(@RequestBody User User1) {
	User.save(User1);
}
}