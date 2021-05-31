package com.nhom2.cinemamanagement.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nhom2.cinemamanagement.models.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Integer> {

}
