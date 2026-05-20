package com.ironhack.airline.repository;

import com.ironhack.airline.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Long>{

}
