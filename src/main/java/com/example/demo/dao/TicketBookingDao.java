package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Ticket;

@Repository
public interface TicketBookingDao extends CrudRepository<Ticket,Integer> {
	@Query(value="SELECT * FROM TICKET",nativeQuery=true)
	List<Ticket> getAllDetails();
}
