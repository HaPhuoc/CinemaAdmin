package com.nhom2.cinemamanagement.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nhom2.cinemamanagement.models.KindOfFood;

public interface KindOfFoodRepository extends JpaRepository <KindOfFood, Integer> {

}
