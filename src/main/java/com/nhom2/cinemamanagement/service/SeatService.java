package com.nhom2.cinemamanagement.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nhom2.cinemamanagement.daos.SeatRepository;
import com.nhom2.cinemamanagement.models.Seat;

@Service
public class SeatService {
	
	@Autowired
	private SeatRepository repo;
	
	public List<Seat> getAllInvoice(){
		return repo.findAll();
	}
	
	public void save(Seat seat) {
		repo.save(seat);
	}
	
	public Seat get(int id) {
		return repo.findById(id).get();
	}
	
	public void delete(int id) {
		repo.deleteById(id);
	}

}
