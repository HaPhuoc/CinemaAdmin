package com.nhom2.cinemamanagement.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nhom2.cinemamanagement.models.Food;

public interface FoodRepository extends JpaRepository<Food, Integer> {

}
