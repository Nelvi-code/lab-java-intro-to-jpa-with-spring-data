package com.ironhack.airline.model;

import jakarta.persistence.*;

@Entity
public class FlightBooking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer customerId;

    private Integer flightId;

    public FlightBooking(){
    }

    public FlightBooking(Integer customerId, Integer flightId){
        this.customerId = customerId;
        this.flightId = flightId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getFlightId() {
        return flightId;
    }

    public void setFlightId(Integer flightId) {
        this.flightId = flightId;
    }
}

