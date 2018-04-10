package org.chai.service;

import org.chai.domain.UserLoginLog;

public interface LoginLogService {
	
	public void listAllUserLoginLog();
	
	public void addUserLoginLog(UserLoginLog userLoginLog);

}
