package com.nhom2.cinemamanagement.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nhom2.cinemamanagement.daos.ScheduleRepository;
import com.nhom2.cinemamanagement.models.Schedule;



@Service
public class ScheduleService {
	
	@Autowired
	private ScheduleRepository repo;
	
	public List<Schedule> getAllInvoice(){
		return repo.findAll();
	}
	
	public void save(Schedule schedule) {
		repo.save(schedule);
	}
	
	public Schedule get(int id) {
		return repo.findById(id).get();
	}
	
	public void delete(int id) {
		repo.deleteById(id);
	}

}
