package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Role;
import com.example.demo.dto.User;

public interface IRoleService {

	public List<Role> listAllRoles();
	
	public Role saveRole(Role role);

	public Role roleById(Long id);

	public Role updateRole(Role role);

	public void deleteRole(Long id);
}
