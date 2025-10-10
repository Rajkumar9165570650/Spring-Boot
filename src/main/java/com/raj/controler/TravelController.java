package com.raj.controler;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

import com.raj.entity.Travel;
import com.raj.service.TravelService;

@Controller
public class TravelController implements CommandLineRunner{
    
	@Autowired
	TravelService service;
	@Override
	public void run(String... args) throws Exception {
		Travel t=new Travel();
		t.setDestination("Pune");t.setTransportationMode("car");t.setPrice(2000d);
		service.addTravel(t);
		Optional<Travel> travelById = service.findTravelById(1l);
		
	}

}
