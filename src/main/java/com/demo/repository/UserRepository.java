package com.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.demo.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {

	User findByUsername(String username);
	
	User findByEmail(String email);
}
