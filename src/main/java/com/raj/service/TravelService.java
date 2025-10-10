package com.raj.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raj.entity.Travel;
import com.raj.repository.TravelRepository;

@Service
public class TravelService implements ITravelService{

	@Autowired
	TravelRepository repo;
	@Override
	public void addTravel(Travel t) {
		repo.save(t);
	}
	@Override
	public Iterable<Travel> getAllTravels() {
		Iterable<Travel> all = repo.findAll();
		return all;
	}
	
	@Override
	public Optional<Travel> findTravelById(Long id) {
	
		Optional<Travel> byId = repo.findById(id);
		return byId;
	}


	

}
