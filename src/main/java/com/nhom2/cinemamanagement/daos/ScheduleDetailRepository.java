package com.nhom2.cinemamanagement.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nhom2.cinemamanagement.models.ScheduleDetail;

public interface ScheduleDetailRepository  extends JpaRepository <ScheduleDetail, Integer> {



}
