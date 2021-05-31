package com.nhom2.cinemamanagement.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nhom2.cinemamanagement.daos.FoodRepository;
import com.nhom2.cinemamanagement.models.Food;


@Service
public class FoodService {
	
	@Autowired
	private FoodRepository repo;
	
	public List<Food> getAllInvoice(){
		return repo.findAll();
	}
	
	public void save(Food food) {
		repo.save(food);
	}
	
	public Food get(int id) {
		return repo.findById(id).get();
	}
	
	public void delete(int id) {
		repo.deleteById(id);
	}

}
