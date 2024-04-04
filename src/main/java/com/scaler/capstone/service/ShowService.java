/**
 * 
 */
package com.scaler.capstone.service;

import java.time.LocalDate;
import java.time.LocalTime;

import com.scaler.capstone.dto.PageResponse;
import com.scaler.capstone.dto.ShowDto;

/**
 * @author vivek
 *
 * @date 04-Sep-2019
 */
public interface ShowService {

	ShowDto addShow(ShowDto showDto);

	PageResponse<ShowDto> searchShows(String movieName, String city, LocalDate showDate, LocalTime showTime, int pageNo, int limit);

}