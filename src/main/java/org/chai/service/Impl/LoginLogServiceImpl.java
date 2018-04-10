package org.chai.service.Impl;

import org.chai.dao.UserLoginLogDao;
import org.chai.domain.UserLoginLog;
import org.chai.service.LoginLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginLogServiceImpl implements LoginLogService {

	@Autowired
	UserLoginLogDao userLoginLogDao;
	@Override
	public void listAllUserLoginLog() {
		userLoginLogDao.listAllUserLoginLog();
		
	}

	@Override
	public void addUserLoginLog(UserLoginLog userLoginLog) {
		userLoginLogDao.addUserLoginLog(userLoginLog);
		
	}

}
