package com.example.backendclientes.controllers;

import com.example.backendclientes.entities.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class customerController {

    @GetMapping("/api/customers")
    public List<Customer> getAll (){
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer());
        return customers;
    }
}
