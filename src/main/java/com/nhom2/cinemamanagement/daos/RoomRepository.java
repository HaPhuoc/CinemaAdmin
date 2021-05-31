package com.nhom2.cinemamanagement.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nhom2.cinemamanagement.models.Room;

public interface RoomRepository  extends JpaRepository <Room, Integer> {



}