package com.nhom2.cinemamanagement.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nhom2.cinemamanagement.models.Seat;

public interface SeatRepository  extends JpaRepository <Seat, Integer> {



}