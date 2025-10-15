package com.raj.controler;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

import com.raj.entity.Travel;
import com.raj.service.TravelService;

@Controller
public class TravelController {
    
	@Autowired
	TravelService service;
	
	public void addTravel(Travel t) {
		service.addTravel(t);;
	}
	
	public void getAllTravels() {
		Iterable<Travel> allTravels = service.getAllTravels();
		allTravels.forEach(System.out::println);
	}
	
	public void findTravelById(Long id) {
	System.out.println(service.findTravelById(id));
	}
	
	public void deleteTravelById(Long id) {
		service.deleteTravelById(id);
		
	}
	
	public void existsById(Long id) {
		System.out.println(service.existsById(id)?"Data is avaiable":"Data is not available");
	}
	
	public void count() {
	
		System.err.println("Data available in : "+service.count());
	}
	
	public void delete(Travel travel) {
		service.delete(travel);
		System.err.println("Data is delete "+travel);
	}
	
	public void deleteAll() {
		service.deleteAll();
		
	}


	

}
