package com.dudu.maventest.user.dao;


import java.util.List;
 
import com.dudu.maventest.user.model.User;

public interface UserDao {
	
	List<User> getUserList();
	void insertUser(User user);
	void deleteUser(User user);
	void updateUser(User user);

}
