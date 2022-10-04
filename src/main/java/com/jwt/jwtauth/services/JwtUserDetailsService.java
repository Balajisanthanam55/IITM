package com.jwt.jwtauth.services;

//use online tool to bcrypt password
import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		if ("balaji".equals(username)) {
			return new User("balaji", "$2y$10$hWgobVghen0xX4SOKQmeDevACkaPMSeOZxwp8HX/tpzxCmhX7uc7a",
					new ArrayList<>());
		} else {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
	}

}