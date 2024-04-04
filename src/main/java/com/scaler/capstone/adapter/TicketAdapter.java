/**
 * 
 */
package com.scaler.capstone.adapter;

import com.scaler.capstone.dto.TicketDto;
import com.scaler.capstone.model.TicketEntity;

import lombok.experimental.UtilityClass;

/**
 * @author vivek
 *
 * @date 04-Sep-2019
 */
@UtilityClass
public class TicketAdapter {

	public static TicketEntity toEntity(TicketDto ticketDto) {

		return TicketEntity.builder()
				.allottedSeats(ticketDto.getAllottedSeats())
				.amount(ticketDto.getAmount())
				.build();

	}

	public static TicketDto toDto(TicketEntity ticketEntity) {

		return TicketDto.builder()
				.id(ticketEntity.getId())
				.allottedSeats(ticketEntity.getAllottedSeats())
				.amount(ticketEntity.getAmount())
				.show(ShowAdapter.toDto(ticketEntity.getShow()))
				.build();
	}

}