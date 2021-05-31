package com.nhom2.cinemamanagement.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nhom2.cinemamanagement.daos.KindOfMovieRepository;
import com.nhom2.cinemamanagement.models.KindOfMovie;






@Service
public class KindOfMovieService {
	
	@Autowired
	private KindOfMovieRepository repo;
	
	public List<KindOfMovie> getAllInvoice(){
		return repo.findAll();
	}
	
	public void save(KindOfMovie kindOfMovie) {
		repo.save(kindOfMovie);
	}
	
	public KindOfMovie get(int id) {
		return repo.findById(id).get();
	}
	
	public void delete(int id) {
		repo.deleteById(id);
	}

}
