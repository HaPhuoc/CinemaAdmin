package com.nhom2.cinemamanagement.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nhom2.cinemamanagement.models.Screening;

public interface ScreeningRepository  extends JpaRepository <Screening, Integer> {



}
