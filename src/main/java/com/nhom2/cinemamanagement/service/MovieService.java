package com.nhom2.cinemamanagement.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nhom2.cinemamanagement.daos.MovieRepository;
import com.nhom2.cinemamanagement.models.Movie;







@Service
public class MovieService {
	
	@Autowired
	private MovieRepository repo;
	
	public List<Movie> getAllInvoice(){
		return repo.findAll();
	}
	
	public void save(Movie movie) {
		repo.save(movie);
	}
	
	public Movie get(int id) {
		return repo.findById(id).get();
	}
	
	public void delete(int id) {
		repo.deleteById(id);
	}

}
