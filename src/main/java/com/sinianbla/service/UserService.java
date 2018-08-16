package com.sinianbla.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinianbla.dao.UserDao;
import com.sinianbla.entity.UserEntity;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
    public void add(){
        System.out.print("service................");
    }
    
    public UserEntity getUserInfo(Long id){
    	return userDao.searchUserInfoById(id);
    }
}
