package com.example.demo.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.TicketBookingDao;
import com.example.demo.entities.Ticket;

@Service
public class TicketBookingService {
	
	@Autowired
	public TicketBookingDao ticketBookingDao;

	public Ticket createNewTicket() {
		
		//return "welcome to service class";
//		
		Ticket ticket=new Ticket();
		ticket.setDestStation("b");
		ticket.setBookingDate(new Date());
		ticket.setSourceStation("a");
		ticket.setPassengerName("kumar");
		ticket.setEmail("nomail@gmail.com");
		
		return ticketBookingDao.save(ticket);
		
	}
	
	public List<Ticket> getAllTickets() {
		return ticketBookingDao.getAllDetails();
	}
}
