package com.alu.dao;
 
import com.alu.domain.User;
 
public interface UserDao {
	
	/**
	 * @param userId
	 * @return User
	 */
	public User selectUserById(Integer userId);

	public int addUser(User user);

	public int delUserById(int userID);
	
	public int updUser(User user);
 
}
