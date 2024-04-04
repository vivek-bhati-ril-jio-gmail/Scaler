package com.scaler.capstone.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.scaler.capstone.model.UserEntity;

/**
 * 
 * @author vivek
 *
 * @date 04-Sep-2019
 */
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long>, JpaSpecificationExecutor<UserEntity> {

	boolean existsByMobile(String mobile);

	@Transactional
	void deleteByMobile(String mobile);
}