package com.scaler.capstone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.scaler.capstone.model.TheaterEntity;

/**
 * 
 * @author vivek
 *
 * @date 04-Sep-2019
 */
@Repository
public interface TheaterRepository extends JpaRepository<TheaterEntity, Long>, JpaSpecificationExecutor<TheaterEntity> {

}