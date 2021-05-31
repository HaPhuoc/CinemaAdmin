package com.nhom2.cinemamanagement.models;

import java.util.Date;

public class Screening {
 private String screeningID;
 private Date timeStart;
 private Date timeEnd;
public String getScreeningID() {
	return screeningID;
}
public void setScreeningID(String screeningID) {
	this.screeningID = screeningID;
}
public Date getTimeStart() {
	return timeStart;
}
public void setTimeStart(Date timeStart) {
	this.timeStart = timeStart;
}
public Date getTimeEnd() {
	return timeEnd;
}
public void setTimeEnd(Date timeEnd) {
	this.timeEnd = timeEnd;
}
 
}
