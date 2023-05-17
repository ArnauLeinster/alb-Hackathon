package com.example.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Role;

public interface IRolesDAO extends JpaRepository<Role, Long>{

}
