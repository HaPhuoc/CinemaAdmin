package com.nhom2.cinemamanagement.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nhom2.cinemamanagement.models.KindOfMovie;

public interface KindOfMovieRepository extends JpaRepository <KindOfMovie, Integer> {


}
