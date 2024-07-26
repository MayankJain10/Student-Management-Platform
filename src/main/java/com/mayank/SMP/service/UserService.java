package com.mayank.SMP.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.mayank.SMP.model.User;
import com.mayank.SMP.model.dto.UserRegistrationDto;



public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
