package org.chai.service;

import java.util.List;

import org.chai.domain.User;

public interface UserService {

	public void addUser(User user);
	
	public void updateUserByUserName(User user);
	
	public User getUserByUserName(String userName);
	
	public void deleteUserByUserName(String userName);
	
	public void loginSuccess(User user);
	
	public String getPassword(String username);
	
	public List<User> getAllUser();
}
