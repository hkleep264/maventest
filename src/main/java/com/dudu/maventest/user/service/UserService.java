package com.dudu.maventest.user.service;

import java.util.List;

import com.dudu.maventest.user.model.User;

public interface UserService {
	
	List<User> getUserList();
	void insertUser(User user);
	void deleteUser(User user);
	void updateUser(User user);

}
