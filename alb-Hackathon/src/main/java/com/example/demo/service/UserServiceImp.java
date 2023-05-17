package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.DAO.IUserDAO;
import com.example.demo.dto.Role;
import com.example.demo.dto.User;

public class UserServiceImp implements IUserService{

	@Autowired
	IUserDAO iUserDAO;
	
	@Override
	public List<User> listAllUsers() {
		// TODO Auto-generated method stub
		return iUserDAO.findAll();
	}

	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return iUserDAO.save(user);
	}

	@Override
	public User userById(Long id) {
		// TODO Auto-generated method stub
		return iUserDAO.findById(id).get();
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return iUserDAO.save(user);
	}

	@Override
	public void deleteUser(Long id) {
		// TODO Auto-generated method stub
		iUserDAO.deleteById(id);
	}

}
