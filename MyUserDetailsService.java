package com.edu.SpringBootVehicleApp.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.edu.SpringBootVehicleApp.entity.User;
import com.edu.SpringBootVehicleApp.repository.UserRepository;



@Service
public class MyUserDetailsService implements UserDetailsService {
	
	
	@Autowired
    UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Optional<User> user = userRepository.findByEmail(email);
		user.orElseThrow(()-> new UsernameNotFoundException("Not found "+ email));
		return user.map(MyUserDetails::new).get();
		//return new MyUserDetails(user);
	}

}