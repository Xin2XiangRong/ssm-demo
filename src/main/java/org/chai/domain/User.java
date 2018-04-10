package org.chai.domain;

import java.io.Serializable;
import java.sql.Timestamp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="user对象",description="用户对象user")
public class User implements Serializable{

	//0代表管理员,1代表普通用户
	private static final int USER_ADMIN = 0;
	private static final int USER_NORMAL =1;
	//0代表用户未被锁定,1代表用户锁定
	private static final int USER_UNLOCK = 0;
	private static final int USER_LOCK =1;
	//用户属性
	private int userId;
	
	@ApiModelProperty(value="用户名",name="username",example="xiao")
	private String userName;
	private String password;
	private int userPhone;
	private int userEmail;
	private String userSex;
	private Timestamp createTime;
	private int userType;
	
	@ApiModelProperty(value="状态",name="state", required=true)
	private int userState;
	private int credit;
	private Timestamp lastLoginTime;
	private String lastIp;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(int userPhone) {
		this.userPhone = userPhone;
	}
	public int getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(int userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserSex() {
		return userSex;
	}
	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	public int getUserType() {
		return userType;
	}
	public void setUserType(int userType) {
		this.userType = userType;
	}
	public int getUserState() {
		return userState;
	}
	public void setUserState(int userState) {
		this.userState = userState;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	public Timestamp getLastLoginTime() {
		return lastLoginTime;
	}
	public void setLastLoginTime(Timestamp lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}
	public String getLastIp() {
		return lastIp;
	}
	public void setLastIp(String lastIp) {
		this.lastIp = lastIp;
	}
	
	@Override
	public String toString() {
		return "User{" + 
				"userId=" + userId +
				"userName=" + userName + 
				"password=" + password +
				"userPhone=" + userPhone +
				"userEmail=" + userEmail +
				"userSex=" + userSex +
				"createTime=" + createTime +
				"userType=" + userType +
				"userState=" + userState +
				", lastLoginTime=" + lastLoginTime +
				", lastIp=" + lastIp+ "}";
	}
}