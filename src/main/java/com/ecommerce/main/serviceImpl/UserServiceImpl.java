package com.ecommerce.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.main.entity.User;
import com.ecommerce.main.repo.UserRepository;
import com.ecommerce.main.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User registerUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public String loginUser(String email, String password) throws Exception {
		User user = userRepository.findByEmail(email);
		if(user.getPassword().equals(password)) {
			return "Login Succesfull";
		}else {
			throw new Exception("Unsuccesfull Login");
		}
	}

}
