package com.alu.service;
 
import org.junit.Test;  
import org.springframework.beans.factory.annotation.Autowired;
 
import com.alu.baseTest.SpringTestCase;
import com.alu.domain.User;
import com.alu.service.UserService;
 
public class UserServiceTest extends SpringTestCase {
	
	@Autowired  
    private UserService userService; 
	
	@Test  
    public void selectUserByIdTest(){ 
        User user = userService.selectUserById(3);  
        /**
        User user2 = userService.selectUserById(2); 
        System.out.println(user.getUserName() + ":" + user.getUserPassword());
        System.out.println(user2.getUserName() + ":" + user2.getUserPassword());
        User user3 = new User();
        user3.setUserId(4);
        user3.setUserName("liuzs");
        user3.setUserPassword("123456");
        System.out.println(user3.toString());**/
        //int ret = userService.addUser(user3);
        //int ret = userService.delUserById(4);
        user.setUserName("jiangjf");
        int ret = userService.updUser(user);
        System.out.println("ret"+ret);
    }  
}
