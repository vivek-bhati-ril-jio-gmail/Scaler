/**
 * 
 */
package com.scaler.capstone.exception;

import lombok.Getter;

/**
 * @author vivek
 *
 * @date 05-Sep-2019
 */
@Getter
public class DuplicateRecordException extends RuntimeException {

	private static final long serialVersionUID = 646182706219385282L;

	private final String message;

	public DuplicateRecordException(String message) {
		super(message);
		this.message = message;
	}

}