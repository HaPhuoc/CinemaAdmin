package com.nhom2.cinemamanagement.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nhom2.cinemamanagement.models.Ticket;

public interface TicketRepository  extends JpaRepository <Ticket, Integer> {



}