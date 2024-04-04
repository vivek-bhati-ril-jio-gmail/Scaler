package com.scaler.capstone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.scaler.capstone.enums.MovieLanguage;
import com.scaler.capstone.model.MovieEntity;

/**
 * 
 * @author vivek
 *
 * @date 04-Sep-2019
 */
@Repository
public interface MovieRepository extends JpaRepository<MovieEntity, Long>, JpaSpecificationExecutor<MovieEntity> {

	boolean existsByNameAndLanguage(String name, MovieLanguage language);
}