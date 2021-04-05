package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Ticket;
import com.example.demo.service.TicketBookingService;

@RestController

public class TicketController {
	
	@Autowired
	public TicketBookingService ticketBookingService;
	
	@GetMapping(value="/")
	public Ticket TicketCreation()
	{
		//return "welcome to controller";
		return ticketBookingService.createNewTicket();
	}
	
	@GetMapping(value="/get")
	public List<Ticket> getAllTickets()
	{
		//return "welcome to controller";
		return ticketBookingService.getAllTickets();
	}

}
