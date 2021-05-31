package com.nhom2.cinemamanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nhom2.cinemamanagement.daos.ScreeningRepository;
import com.nhom2.cinemamanagement.models.Screening;

@Service
public class ScreeningService {

	@Autowired
	private ScreeningRepository repo;

	public List<Screening> getAllInvoice() {
		return repo.findAll();
	}

	public void save(Screening screening) {
		repo.save(screening);
	}

	public Screening get(int id) {
		return repo.findById(id).get();
	}

	public void delete(int id) {
		repo.deleteById(id);
	}

}
