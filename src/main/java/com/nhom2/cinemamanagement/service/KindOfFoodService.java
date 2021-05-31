package com.nhom2.cinemamanagement.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nhom2.cinemamanagement.daos.KindOfFoodRepository;
import com.nhom2.cinemamanagement.models.KindOfFood;






@Service
public class KindOfFoodService {
	
	@Autowired
	private KindOfFoodRepository repo;
	
	public List<KindOfFood> getAllInvoice(){
		return repo.findAll();
	}
	
	public void save(KindOfFood kindOfFood) {
		repo.save(kindOfFood);
	}
	
	public KindOfFood get(int id) {
		return repo.findById(id).get();
	}
	
	public void delete(int id) {
		repo.deleteById(id);
	}

}
