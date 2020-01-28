package com.demo.service.impl;

import java.util.Set;

import com.demo.entity.User;
import com.demo.security.PasswordResetToken;
import com.demo.security.UserRole;

public interface UserService {
	PasswordResetToken getPasswordResetToken(final String token);
	
	void createPasswordResetTokenForUser(final User user, final String token);
	
	User findByUsername(String username);
	
	User findByEmail(String email);
	
	User createUser(User user, Set<UserRole> userRoles) throws Exception;
	
}
