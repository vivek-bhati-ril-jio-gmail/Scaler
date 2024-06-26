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
public class DependencyException extends RuntimeException {

	private static final long serialVersionUID = 646182706219385282L;

	private final String message;

	public DependencyException(String message) {
		super(message);
		this.message = message;
	}

}