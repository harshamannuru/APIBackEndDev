package com.ecommerce.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.main.entity.User;
import com.ecommerce.main.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/registerUser")
	public ResponseEntity<User> registerUser(@RequestBody User user) {
		User registerUser = userService.registerUser(user);
		return new ResponseEntity<User>(registerUser,HttpStatus.OK);
	}
	
	@PostMapping("/loginUser")
	public ResponseEntity<String> loginUser(@RequestParam String email,@RequestParam String password) throws Exception {
		String loginUser = userService.loginUser(email, password);
		return new ResponseEntity<String>(loginUser,HttpStatus.ACCEPTED);
	}
	
}
