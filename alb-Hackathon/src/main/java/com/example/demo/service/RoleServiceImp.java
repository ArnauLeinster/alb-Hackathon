package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.DAO.IRolesDAO;
import com.example.demo.dto.Role;

public class RoleServiceImp implements IRoleService{

	@Autowired
	IRolesDAO iRolesDAO;
	@Override
	public List<Role> listAllRoles() {
		return iRolesDAO.findAll();
	}
	@Override
	public Role saveRole(Role role) {
		// TODO Auto-generated method stub
		return iRolesDAO.save(role);
	}
	
	@Override
	public Role roleById(Long id) {
		// TODO Auto-generated method stub
		return iRolesDAO.findById(id).get();
	}
	@Override
	public Role updateRole(Role role) {
		// TODO Auto-generated method stub
		return iRolesDAO.save(role);
	}
	@Override
	public void deleteRole(Long id) {
		// TODO Auto-generated method stub
		iRolesDAO.deleteById(id);
	}


}
