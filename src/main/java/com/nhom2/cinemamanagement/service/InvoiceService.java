package com.nhom2.cinemamanagement.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nhom2.cinemamanagement.daos.InvoiceRepository;
import com.nhom2.cinemamanagement.models.Invoice;





@Service
public class InvoiceService {
	
	@Autowired
	private InvoiceRepository repo;
	
	public List<Invoice> getAllInvoice(){
		return repo.findAll();
	}
	
	public void save(Invoice invoice) {
		repo.save(invoice);
	}
	
	public Invoice get(int id) {
		return repo.findById(id).get();
	}
	
	public void delete(int id) {
		repo.deleteById(id);
	}

}
