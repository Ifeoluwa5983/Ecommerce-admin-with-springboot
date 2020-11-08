package com.exercise.admin.admincontroller;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.exercise.admin.adminDAO.UserRepository;
import com.exercise.admin.entity.User;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UserController {
	
	private UserRepository userRepository;
	
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@GetMapping("/signup")
	public void signup(@RequestBody User user) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		userRepository.save(user);
		
	}

}
