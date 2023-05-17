package com.example.demo.service;
import java.util.List;

import com.example.demo.dto.Role;
import com.example.demo.dto.User;

public interface IUserService {

	public List<User> listAllUsers();
	
	public User saveUser(User user);

	public User userById(Long id);

	public User updateUser(User user);

	public void deleteUser(Long id);
}
