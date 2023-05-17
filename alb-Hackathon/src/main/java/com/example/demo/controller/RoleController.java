package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.dto.Role;
import com.example.demo.service.RoleServiceImp;


public class RoleController {


	@Autowired
	RoleServiceImp roleServiceImp;

	@GetMapping("/roles")
	public List<Role> listRole() {
		return roleServiceImp.listAllRoles();
	}

	@PostMapping("/roles")
	public Role saveRole(@RequestBody Role role) {
		return roleServiceImp.saveRole(role);
	}

	@GetMapping("/roles/{id}")
	public Role roleById(@PathVariable(name = "id_role") Long id) {

		Role roleById = new Role();

		roleById = roleServiceImp.roleById(id);

		System.out.println("Role by Id: " + roleById);

		return roleById;
	}

	@PutMapping("/roles/{id}")
	public Role updateRole(@PathVariable(name = "id_role") Long id, @RequestBody Role role) {

		Role selectedRole = new Role();
		Role updatedRole = new Role();

		selectedRole = roleServiceImp.roleById(id);

		selectedRole.setId_role(role.getId_role());
		selectedRole.setTitle(role.getTitle());

		updatedRole = roleServiceImp.updateRole(selectedRole);

		System.out.println("Updated role is: " + updatedRole);

		return updatedRole;
	}

	@DeleteMapping("/role/{id}")
	public void deleteRole(@PathVariable(name = "id_role") Long id) {
		roleServiceImp.deleteRole(id);
	}

}