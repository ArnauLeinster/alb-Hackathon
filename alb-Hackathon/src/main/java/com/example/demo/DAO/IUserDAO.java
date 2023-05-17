package com.example.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.User;

public interface IUserDAO extends JpaRepository<User, Long>{

}