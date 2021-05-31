package com.nhom2.cinemamanagement.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nhom2.cinemamanagement.daos.CustomerRepository;
import com.nhom2.cinemamanagement.models.Customer;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository repo;
	
	public List<Customer> getAllInvoice(){
		return repo.findAll();
	}
	
	public void save(Customer customer) {
		repo.save(customer);
	}
	
	public Customer get(int id) {
		return repo.findById(id).get();
	}
	
	public void delete(int id) {
		repo.deleteById(id);
	}

}
