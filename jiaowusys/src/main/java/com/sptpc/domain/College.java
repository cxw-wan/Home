package com.sptpc.domain;

import java.io.Serializable;

public class College implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int collegeID;
	private String collegeName;
	public int getCollegeID() {
		return collegeID;
	}
	public void setCollegeID(int collegeID) {
		this.collegeID = collegeID;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	

}
