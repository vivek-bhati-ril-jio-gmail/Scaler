/**
 * 
 */
package com.scaler.capstone.service;

import com.scaler.capstone.dto.BookTicketRequestDto;
import com.scaler.capstone.dto.TicketDto;

/**
 * @author vivek
 *
 * @date 05-Sep-2019
 */
public interface TicketService {

	TicketDto bookTicket(BookTicketRequestDto bookTicketRequestDto);

	TicketDto getTicket(long id);
}