package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.dto.User;
import com.example.demo.service.UserServiceImp;

public class UserController {

	@Autowired
	UserServiceImp userServiceImp;


	
	
	@GetMapping("/users")
	public List<User> listUser() {
		return userServiceImp.listAllUsers();
	}

	@PostMapping("/users")
	public User saveUser(@RequestBody User user) {
		return userServiceImp.saveUser(user);
	}

	@GetMapping("/users/{id}")
	public User userById(@PathVariable(name = "id_user") Long id) {

		User userById = new User();

		userById = userServiceImp.userById(id);

		System.out.println("User by Id: " + userById);

		return userById;
	}

	@PutMapping("/users/{id}")
	public User updateUser(@PathVariable(name = "id_user") Long id, @RequestBody User user) {

		User selectedUser = new User();
		User updatedUser = new User();

		selectedUser = userServiceImp.userById(id);

		selectedUser.setId_user(user.getId_user());
		selectedUser.setEmail(user.getEmail());
		selectedUser.setPass(user.getPass());
		selectedUser.setUsername(user.getUsername());
		selectedUser.setUser_role(user.getUser_role());

		updatedUser = userServiceImp.updateUser(selectedUser);

		System.out.println("Updated user is: " + updatedUser);

		return updatedUser;
	}

	@DeleteMapping("/user/{id}")
	public void deleteUser(@PathVariable(name = "id_user") Long id) {
		userServiceImp.deleteUser(id);
	}
}
