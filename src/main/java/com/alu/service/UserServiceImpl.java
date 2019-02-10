package com.alu.service;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.alu.dao.UserDao;
import com.alu.domain.User;
 
@Service  
public class UserServiceImpl implements UserService {
 
	@Autowired  
    private UserDao userDao;  
  
    public User selectUserById(Integer userId) {  
        return userDao.selectUserById(userId);  
          
    }

	public int addUser(User user) {
		// TODO Auto-generated method stub
		return userDao.addUser(user);
	}

	public int delUserById(int userId) {
		// TODO Auto-generated method stub
		return userDao.delUserById(userId);
	}

	public int updUser(User user) {
		// TODO Auto-generated method stub
		return userDao.updUser(user);
	}

	
}
