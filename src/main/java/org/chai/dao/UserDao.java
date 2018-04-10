package org.chai.dao;

import java.util.List;

import org.chai.domain.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {

	public User findUserByUserName(String username);
	
	public User findUserByUserId(int id);
	
	public void addUser(User user);
	
	public void deleteUserByUserName(String username);
	
	public void updateUserByUserName(User user);
	
	public String getUserPasswordByUserName(String username);
	
	public List<User> getAllUserInfo();
	
	
}
