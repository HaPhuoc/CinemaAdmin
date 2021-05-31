package com.nhom2.cinemamanagement.models;

import java.util.Date;

public class Schedule {
	private int scheduleID;
	private int screeningID;
	private int movieID;
	private int roomID;
	private Date showDate;
	public int getScheduleID() {
		return scheduleID;
	}
	public void setScheduleID(int scheduleID) {
		this.scheduleID = scheduleID;
	}
	public int getScreeningID() {
		return screeningID;
	}
	public void setScreeningID(int screeningID) {
		this.screeningID = screeningID;
	}
	public int getMovieID() {
		return movieID;
	}
	public void setMovieID(int movieID) {
		this.movieID = movieID;
	}
	public int getRoomID() {
		return roomID;
	}
	public void setRoomID(int roomID) {
		this.roomID = roomID;
	}
	public Date getShowDate() {
		return showDate;
	}
	public void setShowDate(Date showDate) {
		this.showDate = showDate;
	}
	
	
	
}
