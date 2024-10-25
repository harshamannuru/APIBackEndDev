package com.ecommerce.main.service;

import com.ecommerce.main.entity.User;

public interface UserService {
	
	public User registerUser(User user);
	
	public String loginUser(String email,String password) throws Exception;
}
