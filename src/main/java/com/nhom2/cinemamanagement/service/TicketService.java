package com.nhom2.cinemamanagement.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nhom2.cinemamanagement.daos.TicketRepository;
import com.nhom2.cinemamanagement.models.Ticket;


@Service
public class TicketService {
	
	@Autowired
	private TicketRepository repo;
	
	public List<Ticket> getAllInvoice(){
		return repo.findAll();
	}
	
	public void save(Ticket ticket) {
		repo.save(ticket);
	}
	
	public Ticket get(int id) {
		return repo.findById(id).get();
	}
	
	public void delete(int id) {
		repo.deleteById(id);
	}

}
