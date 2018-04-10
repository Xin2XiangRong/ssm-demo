package org.chai.dao;

import java.util.List;

import org.chai.domain.UserLoginLog;
import org.springframework.stereotype.Repository;

@Repository
public interface UserLoginLogDao {
	public List<UserLoginLog> listAllUserLoginLog();

	public void addUserLoginLog(UserLoginLog userLoginLog);
}
