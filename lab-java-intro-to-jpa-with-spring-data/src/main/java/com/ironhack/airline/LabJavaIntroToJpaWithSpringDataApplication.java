package com.ironhack.airline;

import com.ironhack.airline.repository.CustomerRepository;
import com.ironhack.airline.repository.FlightBookingRepository;
import com.ironhack.airline.repository.FlightRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.ironhack.airline.model.*;


@SpringBootApplication
public class LabJavaIntroToJpaWithSpringDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabJavaIntroToJpaWithSpringDataApplication.class, args);
	}

	@Bean
	CommandLineRunner run(
			CustomerRepository customerRepo,
			FlightRepository flightRepo,
			FlightBookingRepository bookingRepo){

		return  args -> {

			Customer alice = customerRepo.save(
					new Customer("Alice", CustomerStatus.GOLD, 120000)
			);

			Customer bob = customerRepo.save(
					new Customer("Bob", CustomerStatus.SILVER, 85000)
			);

			Customer carol = customerRepo.save(
					new Customer("Carol", CustomerStatus.NONE, 25000)
			);

			Flight flight1 = flightRepo.save(
					new Flight("AB123", "Boeing 747", 300, 400)
			);

			Flight flight2 = flightRepo.save(
					new Flight("CD456", "Airbus A320", 220, 700)
			);

			Flight flight3 = flightRepo.save(
					new Flight("EF789", "Boeing 777", 350, 1000)
			);

			bookingRepo.save(new FlightBooking(alice.getId().intValue(), flight1.getId().intValue()));

			bookingRepo.save(new FlightBooking(bob.getId().intValue(), flight2.getId().intValue()));

			bookingRepo.save(new FlightBooking(carol.getId().intValue(), flight3.getId().intValue()));


		};


	}



	}



