package com.scaler.capstone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.scaler.capstone.model.TicketEntity;

/**
 * 
 * @author vivek
 *
 * @date 04-Sep-2019
 */
@Repository
public interface TicketRepository extends JpaRepository<TicketEntity, Long>, JpaSpecificationExecutor<TicketEntity> {

}