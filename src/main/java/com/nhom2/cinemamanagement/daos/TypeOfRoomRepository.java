package com.nhom2.cinemamanagement.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nhom2.cinemamanagement.models.TypeOfRoom;


public interface TypeOfRoomRepository  extends JpaRepository <TypeOfRoom, Integer> {



}