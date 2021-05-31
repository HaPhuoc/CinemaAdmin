package com.nhom2.cinemamanagement.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nhom2.cinemamanagement.daos.StaffRepository;
import com.nhom2.cinemamanagement.models.Staff;


@Service
public class StaffService {
	
	@Autowired
	private StaffRepository repo;
	
	public List<Staff> getAllInvoice(){
		return repo.findAll();
	}
	
	public void save(Staff staff) {
		repo.save(staff);
	}
	
	public Staff get(int id) {
		return repo.findById(id).get();
	}
	
	public void delete(int id) {
		repo.deleteById(id);
	}

}
