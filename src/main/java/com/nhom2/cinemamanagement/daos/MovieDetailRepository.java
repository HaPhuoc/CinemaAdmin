package com.nhom2.cinemamanagement.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nhom2.cinemamanagement.models.MovieDetail;

public interface MovieDetailRepository extends JpaRepository <MovieDetail, Integer> {



}
