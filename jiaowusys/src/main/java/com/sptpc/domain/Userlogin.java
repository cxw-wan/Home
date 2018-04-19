package com.sptpc.domain;

import java.io.Serializable;

public class Userlogin implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3886746775638426353L;
	private int userID;
	private String userName;//登录的账号名
	private String password;//密码
	private int role;//权限的ID号
	private String roleName;//权限的名称
	
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
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
	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	}
	
}
