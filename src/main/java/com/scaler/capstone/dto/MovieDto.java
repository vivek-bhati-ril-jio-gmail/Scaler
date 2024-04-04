/**
 * 
 */
package com.scaler.capstone.dto;

import java.time.LocalDate;

import com.scaler.capstone.enums.CertificateType;
import com.scaler.capstone.enums.MovieLanguage;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author vivek
 *
 * @date 05-Sep-2019
 */
@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
@ToString
public class MovieDto {

	private long id;

	private String name;

	private MovieLanguage language;

	private CertificateType certificateType;

	private LocalDate releaseDate;

}