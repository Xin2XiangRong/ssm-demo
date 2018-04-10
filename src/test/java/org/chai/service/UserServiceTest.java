package org.chai.service;

import java.sql.Timestamp;

import org.chai.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class) //指定测试用例的运行器
@ContextConfiguration("classpath:applicationContext.xml")
public class UserServiceTest {

	@Autowired
	private UserService userService; 
	@Test
	public  void addUserTest() {
		User user = new User();
		user.setUserName("xiao2");
		user.setPassword("12345");
		user.setUserEmail(12342);
		user.setUserPhone(1234);
		user.setCredit(0);
		user.setUserSex("m");
		user.setUserState(0);
		user.setUserType(1);
		user.setCreateTime(new Timestamp(0));
		user.setUserId(0);
		System.out.println(user.getUserEmail());
		userService.addUser(user);
	}
	
	@Test
	public void getPasswordTest() {
		System.out.println( userService.getPassword("xiao"));
	}
	
	
}
