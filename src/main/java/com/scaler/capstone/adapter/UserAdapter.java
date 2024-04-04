/**
 * 
 */
package com.scaler.capstone.adapter;

import com.scaler.capstone.dto.UserDto;
import com.scaler.capstone.model.UserEntity;

import lombok.experimental.UtilityClass;

/**
 * @author vivek
 *
 * @date 04-Sep-2019
 */
@UtilityClass
public class UserAdapter {

	public static UserEntity toEntity(UserDto userDto) {

		return UserEntity.builder()
				.name(userDto.getName())
				.mobile(userDto.getMobile())
				.build();

	}

	public static UserDto toDto(UserEntity userEntity) {

		return UserDto.builder()
				.id(userEntity.getId())
				.name(userEntity.getName())
				.mobile(userEntity.getMobile())
				.build();
	}

}