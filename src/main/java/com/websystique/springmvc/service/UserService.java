package com.websystique.springmvc.service;

import java.util.List;

import com.lnt.View.RegistrationForm;
import com.websystique.springmvc.model.User;



public interface UserService {
	
	User findById(long id);
	
	User findByName(String name);
	
	void saveUser(User user);
	
	void updateUser(User user);
	
	void deleteUserById(long id);

	List<User> findAllUsers(); 
	
	void deleteAllUsers();
	
	public boolean isUserExist(User user);

	public List<User> saveUserSwing(User model, RegistrationForm form);
	
}
