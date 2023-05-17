package com.example.demo.dto;

import jakarta.persistence.*;

public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_user;

	
	@Column(name = "email")
	private String email;
	
	@Column(name = "pass")
	private String pass;
	
	@Column(name = "username")
	private String username;
	
	@ManyToOne
	@JoinColumn(name = "id_role")
	private Role user_role;
	
	public User() {
	}

	public User(String email, String pass, String username, Role user_role) {
		
		this.email = email;
		this.pass = pass;
		this.username = username;
		this.user_role = user_role;
	}

	public int getId_user() {
		return id_user;
	}

	public void setId_user(int id_user) {
		this.id_user = id_user;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Role getUser_role() {
		return user_role;
	}

	public void setUser_role(Role user_role) {
		this.user_role = user_role;
	}

	
}
