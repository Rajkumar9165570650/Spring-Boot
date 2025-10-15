package com.raj.comandline;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.raj.controler.TravelController;
import com.raj.entity.Travel;

@Component
public class Command implements CommandLineRunner {

	@Autowired
	TravelController controller;
	
	@Override
	public void run(String... args) throws Exception {
		
		
		Travel t=new Travel();
		//t.setId(t.getId());
		t.setDestination("indore");t.setTransportationMode("car");t.setPrice(1223d);
		
		
		while(true) {
			Scanner sc=new Scanner(System.in);
			System.out.println("1)Add\n 2)Retrieve all \n 3)Find a travel booking by ID"
					+ "\n 4).Delete a travel booking by ID"+
					"5) Check if a travel booking exists\n"+
					"6)Count total travel bookings\n"+
					"7)Delete a specific travel booking\n"+
					"8)Delete all travel bookings.\n"+
					"9)Exit");
			System.out.print("Please insert==");
			switch(sc.nextInt()) {
			case 1:
				controller.addTravel(t);break;
			case 2:controller.getAllTravels();break;
			case 3:System.out.print("Enter the id =");
				controller.findTravelById(sc.nextLong());break;
			case 4:System.out.print("Enter the id =");
				controller.deleteTravelById(sc.nextLong());break;
			case 5:System.out.print("Enter the id =");
				controller.existsById(sc.nextLong());break;
			case 6:controller.count();break;
			case 7:	controller.delete(t);break;
			case 8:controller.deleteAll();break;
			case 9: System.exit(0);
			
			}
		}
	}
}
