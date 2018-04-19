package com.sptpc.domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Teacher implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4825365763937493337L;
	private int userID;
	private int collegeID;
	private String userName;
	private String sex;
	private String degree;
	private String title;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date birthYear;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date grade;
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
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
