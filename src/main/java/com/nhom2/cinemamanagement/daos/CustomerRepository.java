package com.nhom2.cinemamanagement.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nhom2.cinemamanagement.models.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer>  {

}
