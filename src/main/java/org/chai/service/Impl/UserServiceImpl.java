package org.chai.service.Impl;

import java.util.List;

import org.chai.dao.UserDao;
import org.chai.domain.User;
import org.chai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	@Override
	public void addUser(User user) {
		if(user != null)
			userDao.addUser(user);
		
	}

	@Override
	public void updateUserByUserName(User user) {
		if (user != null)
			userDao.updateUserByUserName(user);
		
	}

	@Override
	public void deleteUserByUserName(String userName) {
		if (userName != null) 
			userDao.deleteUserByUserName(userName);
		
	}

	@Override
	public void loginSuccess(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getPassword(String userName) {
		if (userName == null) {
			return null;
		}
		return userDao.getUserPasswordByUserName(userName);
	}

	@Override
	public List<User> getAllUser() {
		return userDao.getAllUserInfo();
	}

	@Override
	public User getUserByUserName(String userName) {
		if(userName == null) {
			return null;
		}
		return userDao.findUserByUserName(userName);
	}

}
