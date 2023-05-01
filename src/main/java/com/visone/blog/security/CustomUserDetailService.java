package com.visone.blog.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.visone.blog.entities.User;
import com.visone.blog.exceptions.ResourceNotFoundException;
import com.visone.blog.repositories.UserRepo;

public class CustomUserDetailService implements UserDetailsService{

	@Autowired
	private UserRepo userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	User user = 	this.userRepo.findByEmail(username).orElseThrow(()-> new ResourceNotFoundException("User", "email : "+ username, 0));		
		return user;
	}

}
