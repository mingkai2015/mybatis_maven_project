package com.alu.service;
 
import com.alu.domain.User;
 
public interface UserService {
	User selectUserById(Integer userId);  
	int addUser(User user);
	int delUserById(int userId);
	int updUser(User user);
}
