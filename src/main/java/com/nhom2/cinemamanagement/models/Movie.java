package com.nhom2.cinemamanagement.models;

import java.util.Date;

public class Movie {
private int movieID;
private int categoryID;
private String movieName;
private String movieDesciption;
private String movieLength;
private Date showTime;
public int getMovieID() {
	return movieID;
}
public void setMovieID(int movieID) {
	this.movieID = movieID;
}
public int getCategoryID() {
	return categoryID;
}
public void setCategoryID(int categoryID) {
	this.categoryID = categoryID;
}
public String getMovieName() {
	return movieName;
}
public void setMovieName(String movieName) {
	this.movieName = movieName;
}
public String getMovieDesciption() {
	return movieDesciption;
}
public void setMovieDesciption(String movieDesciption) {
	this.movieDesciption = movieDesciption;
}
public String getMovieLength() {
	return movieLength;
}
public void setMovieLength(String movieLength) {
	this.movieLength = movieLength;
}
public Date getShowTime() {
	return showTime;
}
public void setShowTime(Date showTime) {
	this.showTime = showTime;
}

}
