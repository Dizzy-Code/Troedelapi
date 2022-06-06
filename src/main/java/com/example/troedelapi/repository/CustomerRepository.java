package com.example.troedelapi.repository;

import com.example.troedelapi.enity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
