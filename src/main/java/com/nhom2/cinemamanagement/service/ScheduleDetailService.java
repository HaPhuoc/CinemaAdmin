package com.nhom2.cinemamanagement.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nhom2.cinemamanagement.daos.ScheduleDetailRepository;
import com.nhom2.cinemamanagement.models.ScheduleDetail;




@Service
public class ScheduleDetailService {
	
	@Autowired
	private ScheduleDetailRepository repo;
	
	public List<ScheduleDetail> getAllInvoice(){
		return repo.findAll();
	}
	
	public void save(ScheduleDetail scheduleDetail) {
		repo.save(scheduleDetail);
	}
	
	public ScheduleDetail get(int id) {
		return repo.findById(id).get();
	}
	
	public void delete(int id) {
		repo.deleteById(id);
	}

}
