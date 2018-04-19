package com.sptpc.domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Student implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6492620969886841830L;
	private int userID;
	private int collegeID;
	private String userName;
	private String sex;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date birthYear;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date grade;
	private String collegeName;
	
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public int getCollegeID() {
		return collegeID;
	}
	public void setCollegeID(int collegeID) {
		this.collegeID = collegeID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(Date birthYear) {
		this.birthYear = birthYear;
	}
	public Date getGrade() {
		return grade;
	}
	public void setGrade(Date grade) {
		this.grade = grade;
	}
	
}
