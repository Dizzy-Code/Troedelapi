package com.example.troedelapi.controller;

import com.example.troedelapi.enity.Customer;
import com.example.troedelapi.repository.CustomerRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    private CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping("")
    public List<Customer> index() {
        return customerRepository.findAll();
    }

    @GetMapping("add")
    public void addCustomer() {
        Customer customer = new Customer();
        customer.setFirstname("Hans");
        customer.setLastname("Herbst");
        customerRepository.save(customer);
        System.out.println("Customer hinzugefügt");
    }
}
