package com.ironhack.airline.repository;

import com.ironhack.airline.model.FlightBooking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FlightBookingRepository extends JpaRepository<FlightBooking, Long>{

    List<FlightBooking> findByCustomerId(Integer customerId);

}
