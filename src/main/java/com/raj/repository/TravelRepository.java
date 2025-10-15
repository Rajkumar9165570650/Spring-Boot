package com.raj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.raj.entity.Travel;

public interface TravelRepository  extends JpaRepository<Travel, Long>{

}
