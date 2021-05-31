package com.nhom2.cinemamanagement.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nhom2.cinemamanagement.models.Movie;

public interface MovieRepository extends JpaRepository <Movie, Integer> {



}
