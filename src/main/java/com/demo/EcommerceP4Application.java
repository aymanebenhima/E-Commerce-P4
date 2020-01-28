package com.demo;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.entity.User;
import com.demo.security.Role;
import com.demo.security.UserRole;
import com.demo.service.impl.UserService;
import com.demo.utility.SecurityUtility;

@SpringBootApplication
public class EcommerceP4Application implements CommandLineRunner{
	
	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(EcommerceP4Application.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		User user1 = new User();
		user1.setFirstName("Aymane");
		user1.setLastName("Benhima");
		user1.setUsername("aymanebenhima");
		user1.setPassword(SecurityUtility.passwordEncoder().encode("p"));
		user1.setEmail("aymanebenhima@gmail.com");
		Set<UserRole> userRoles = new HashSet<>();
		Role role1 = new Role();
		role1.setRoleId(1);
		role1.setName("ROLE_USER");
		userRoles.add(new UserRole(user1, role1));
		
		userService.createUser(user1, userRoles);
	}

}
