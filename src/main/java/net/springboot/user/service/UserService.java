package net.springboot.user.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import net.springboot.user.model.User;
import net.springboot.user.web.dto.UserRegistrationDto;

public interface UserService {
	User save(UserRegistrationDto registartionDto);

	UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
}
