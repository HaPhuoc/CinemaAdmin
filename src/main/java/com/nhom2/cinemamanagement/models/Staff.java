package com.nhom2.cinemamanagement.models;

import java.util.Date;

public class Staff {
	private int staffID ;
	private String staffName;
	private Date yearOfBirth;
	private String address;
	private int role;
	private String staffEmail;
	private String staffPassword;
	public int getStaffID() {
		return staffID;
	}
	public void setStaffID(int staffID) {
		this.staffID = staffID;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public Date getYearOfBirth() {
		return yearOfBirth;
	}
	public void setYearOfBirth(Date yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	}
	public String getStaffEmail() {
		return staffEmail;
	}
	public void setStaffEmail(String staffEmail) {
		this.staffEmail = staffEmail;
	}
	public String getStaffPassword() {
		return staffPassword;
	}
	public void setStaffPassword(String staffPassword) {
		this.staffPassword = staffPassword;
	}
	
	
	
}
