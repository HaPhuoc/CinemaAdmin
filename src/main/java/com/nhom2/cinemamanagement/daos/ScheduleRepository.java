package com.nhom2.cinemamanagement.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nhom2.cinemamanagement.models.Schedule;

public interface ScheduleRepository  extends JpaRepository <Schedule, Integer> {



}
