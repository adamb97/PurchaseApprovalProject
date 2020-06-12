package com.adam.pruchaserequestapp.service;

import com.adam.pruchaserequestapp.model.User;

public interface UserService {
	  
	 public User findUserByEmail(String email);
	 
	 public void saveUser(User user);
	}
