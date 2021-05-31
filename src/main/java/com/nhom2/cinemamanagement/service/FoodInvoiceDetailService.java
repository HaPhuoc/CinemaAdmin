package com.nhom2.cinemamanagement.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nhom2.cinemamanagement.daos.FoodInvoiceDetailRepository;
import com.nhom2.cinemamanagement.models.FoodInvoiceDetail;




@Service
public class FoodInvoiceDetailService {
	
	@Autowired
	private FoodInvoiceDetailRepository repo;
	
	public List<FoodInvoiceDetail> getAllInvoice(){
		return repo.findAll();
	}
	
	public void save(FoodInvoiceDetail foodInvoiceDetail) {
		repo.save(foodInvoiceDetail);
	}
	
	public FoodInvoiceDetail get(int id) {
		return repo.findById(id).get();
	}
	
	public void delete(int id) {
		repo.deleteById(id);
	}

}
