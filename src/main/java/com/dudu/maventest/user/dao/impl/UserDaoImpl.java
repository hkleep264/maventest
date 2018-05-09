package com.dudu.maventest.user.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
 
import com.dudu.maventest.user.dao.UserDao;
import com.dudu.maventest.user.model.User;

@Repository("userDao")
public class UserDaoImpl implements UserDao{
	
	@Autowired
    private SqlSession sqlSession;
 
    public void setSqlSession(SqlSession sqlSession){
        this.sqlSession = sqlSession;
    }
 
    @Override
    public List<User> getUserList() {
         
        return sqlSession.selectList("getUserList");
    }
    
    @Override
    public void insertUser(User user) {
    	
    }
    
    @Override
    public void deleteUser(User user) {
    	
    }
    
    @Override
    public void updateUser(User user) {
    	
    }


}
