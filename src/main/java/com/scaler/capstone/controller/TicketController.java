/**
 * 
 */
package com.scaler.capstone.controller;

import javax.validation.constraints.Min;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scaler.capstone.dto.BookTicketRequestDto;
import com.scaler.capstone.dto.TicketDto;
import com.scaler.capstone.service.TicketService;

import lombok.extern.log4j.Log4j2;

/**
 * @author vivek
 *
 * @date 05-Sep-2019
 */
@Log4j2
@RestController
@RequestMapping("ticket")
public class TicketController {

	@Autowired
	private TicketService ticketService;

	@PostMapping("book")
	public ResponseEntity<TicketDto> bookTicket(@RequestBody BookTicketRequestDto bookTicketRequestDto) {

		log.info("Received Request to book ticket: " + bookTicketRequestDto);

		return ResponseEntity.ok(ticketService.bookTicket(bookTicketRequestDto));
	}

	@GetMapping("{id}")
	public ResponseEntity<TicketDto> getTicket(@PathVariable(name = "id") @Min(value = 1, message = "Ticket Id Cannot be -ve") long id) {

		log.info("Received Request to get ticket: " + id);

		return ResponseEntity.ok(ticketService.getTicket(id));
	}
}