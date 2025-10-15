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
	@Override
	public void deleteTravelById(Long id) {
		repo.deleteById(id);
		
	}
	@Override
	public boolean existsById(Long id) {
		
		return repo.existsById(id);
	}
	@Override
	public long count() {
	
		return repo.count();
	}
	@Override
	public void delete(Travel travel) {
		
		repo.delete(travel);
		
	}
	@Override
	public void deleteAll() {
		repo.deleteAll();	
	}


	

}
