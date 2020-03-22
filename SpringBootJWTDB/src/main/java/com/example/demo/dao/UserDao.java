package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.User;

@Repository
public interface UserDao extends CrudRepository<User, Integer> {
	UserDao findByUsername(String username);
}