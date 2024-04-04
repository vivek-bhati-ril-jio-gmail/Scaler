/**
 * 
 */
package com.scaler.capstone.service;

import com.scaler.capstone.dto.UserDto;

/**
 * @author vivek
 *
 * @date 05-Sep-2019
 */
public interface UserService {

	UserDto addUser(UserDto userDto);

	UserDto getUser(long id);
}