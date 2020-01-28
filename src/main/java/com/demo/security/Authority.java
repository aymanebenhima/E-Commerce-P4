/**
 * 
 */
package com.demo.security;

import org.springframework.security.core.GrantedAuthority;

/**
 * @author AYMANE BENHIMA
 *
 */
public class Authority implements GrantedAuthority{
	private final String authority;
	
	public Authority(String authority) {
		this.authority = authority;
	}
	
	@Override
	public String getAuthority() {
		return authority;
	}

}
