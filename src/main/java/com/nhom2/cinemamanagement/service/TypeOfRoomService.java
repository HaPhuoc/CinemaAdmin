package com.nhom2.cinemamanagement.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nhom2.cinemamanagement.daos.TypeOfRoomRepository;
import com.nhom2.cinemamanagement.models.TypeOfRoom;



@Service
public class TypeOfRoomService {
	
	@Autowired
	private TypeOfRoomRepository repo;
	
	public List<TypeOfRoom> getAllInvoice(){
		return repo.findAll();
	}
	
	public void save(TypeOfRoom typeOfRoom) {
		repo.save(typeOfRoom);
	}
	
	public TypeOfRoom get(int id) {
		return repo.findById(id).get();
	}
	
	public void delete(int id) {
		repo.deleteById(id);
	}

}
