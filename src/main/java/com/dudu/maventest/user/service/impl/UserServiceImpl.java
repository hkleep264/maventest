package com.dudu.maventest.user.service.impl;

import java.util.List;

import javax.annotation.Resource;
 
import org.springframework.stereotype.Service;
 
import com.dudu.maventest.user.dao.UserDao;
import com.dudu.maventest.user.model.User;
import com.dudu.maventest.user.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Resource(name="userDao")
    private UserDao userDao;
 
    @Override
    public List<User> getUserList() {
        return userDao.getUserList();
    }
    
    @Override
    public void insertUser(User user) {
    	userDao.insertUser(user);
    }
    
    @Override
    public void deleteUser(User user) {
    	userDao.deleteUser(user);
    }
    
    @Override
    public void updateUser(User user) {
    	userDao.updateUser(user);
    }

}
