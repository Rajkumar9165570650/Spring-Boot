package com.raj.service;

import java.util.List;
import java.util.Optional;

import com.raj.entity.Travel;

public interface ITravelService {
	void addTravel(Travel travel);
	Iterable<Travel> getAllTravels();
	Optional<Travel> findTravelById(Long id);

}
