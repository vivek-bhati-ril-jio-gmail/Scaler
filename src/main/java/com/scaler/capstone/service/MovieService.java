/**
 * 
 */
package com.scaler.capstone.service;

import com.scaler.capstone.dto.MovieDto;

/**
 * @author vivek
 *
 * @date 05-Sep-2019
 */
public interface MovieService {

	MovieDto addMovie(MovieDto movieDto);

	MovieDto getMovie(long id);
}