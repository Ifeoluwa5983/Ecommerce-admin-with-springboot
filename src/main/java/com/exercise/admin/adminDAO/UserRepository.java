package com.exercise.admin.adminDAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exercise.admin.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByUserName(String userName);

}
