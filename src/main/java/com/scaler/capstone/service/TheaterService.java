/**
 * 
 */
package com.scaler.capstone.service;

import com.scaler.capstone.dto.TheaterDto;

/**
 * @author vivek
 *
 * @date 05-Sep-2019
 */
public interface TheaterService {

	TheaterDto addTheater(TheaterDto theaterDto);

	TheaterDto getTheater(long id);
}