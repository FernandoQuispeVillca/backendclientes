package com.example.backendclientes.controllers;

import com.example.backendclientes.entities.Customer;
import com.example.backendclientes.services.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private ICustomerService services;
    /** GET /customers -> Return all customers */
    @GetMapping("/api/customers")
    public List<Customer> getAll (){
        return services.getAll();
    }

    /** GET /customers/{id} -> Return the customer with id {id} */
    @GetMapping("/api/customers/{id}")
    public Customer getById (@PathVariable String id){
        return services.getById(Long.parseLong(id));
    }

    /** Delete /customers -> Delete a customer in the database. */
    @DeleteMapping ("/api/customers/{id}")
    public void remove(@PathVariable String id) {
        services.remove(Long.parseLong(id));
    }

     /** POST /customers -> Create a new customer and save it in the database. */
    @PostMapping ("/api/customers")
    public void save(@RequestBody Customer customer) {
        services.save(customer);
    }
}
