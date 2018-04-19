package com.sptpc.domain;

import java.io.Serializable;

public class Course implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2510144252497070621L;
	private int courseID;
	private int teacherID;
	private int courseWeek;
	private int collegeID;
	private int score;
	private String courseName;
	private String courseTime;
	private String classRoom;
	private String courseType;
	public int getCourseID() {
		return courseID;
	}
	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}
	public int getTeacherID() {
		return teacherID;
	}
	public void setTeacherID(int teacherID) {
		this.teacherID = teacherID;
	}
	public int getCourseWeek() {
		return courseWeek;
	}
	public void setCourseWeek(int courseWeek) {
		this.courseWeek = courseWeek;
	}
	public int getCollegeID() {
		return collegeID;
	}
	public void setCollegeID(int collegeID) {
		this.collegeID = collegeID;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseTime() {
		return courseTime;
	}
	public void setCourseTime(String courseTime) {
		this.courseTime = courseTime;
	}
	public String getClassRoom() {
		return classRoom;
	}
	public void setClassRoom(String classRoom) {
		this.classRoom = classRoom;
	}
	public String getCourseType() {
		return courseType;
	}
	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}
	
}
