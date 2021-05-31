package com.nhom2.cinemamanagement.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nhom2.cinemamanagement.daos.RoomRepository;
import com.nhom2.cinemamanagement.models.Room;








@Service
public class RoomService {
	
	@Autowired
	private RoomRepository repo;
	
	public List<Room> getAllInvoice(){
		return repo.findAll();
	}
	
	public void save(Room room) {
		repo.save(room);
	}
	
	public Room get(int id) {
		return repo.findById(id).get();
	}
	
	public void delete(int id) {
		repo.deleteById(id);
	}

}
