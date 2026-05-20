package com.ironhack.airline.repository;

import com.ironhack.airline.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import com.ironhack.airline.model.CustomerStatus;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    List<Customer> findByStatus(CustomerStatus status);


}
