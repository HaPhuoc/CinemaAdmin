package com.nhom2.cinemamanagement.models;

public class Customer {
private int customerID;
private String customerName;
private String customerPhoneNumber;
private float cumulativePoints;
private String customerEmail;
private String customerPassword;
private String authorProvider;
public int getCustomerID() {
	return customerID;
}
public void setCustomerID(int customerID) {
	this.customerID = customerID;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public String getCustomerPhoneNumber() {
	return customerPhoneNumber;
}
public void setCustomerPhoneNumber(String customerPhoneNumber) {
	this.customerPhoneNumber = customerPhoneNumber;
}
public float getCumulativePoints() {
	return cumulativePoints;
}
public void setCumulativePoints(float cumulativePoints) {
	this.cumulativePoints = cumulativePoints;
}
public String getCustomerEmail() {
	return customerEmail;
}
public void setCustomerEmail(String customerEmail) {
	this.customerEmail = customerEmail;
}
public String getCustomerPassword() {
	return customerPassword;
}
public void setCustomerPassword(String customerPassword) {
	this.customerPassword = customerPassword;
}
public String getAuthorProvider() {
	return authorProvider;
}
public void setAuthorProvider(String authorProvider) {
	this.authorProvider = authorProvider;
}

}
