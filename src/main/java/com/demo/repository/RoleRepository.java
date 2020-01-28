package com.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.demo.security.Role;

public interface RoleRepository extends CrudRepository<Role, Long>{
	Role findByName(String name);
}
