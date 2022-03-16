package com.example.backendclientes.controllers;

import com.example.backendclientes.entities.Customer;
import com.example.backendclientes.services.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private ICustomerService services;

    @GetMapping("/api/customers")
    public List<Customer> getAll (){
        return services.getAll();
    }
}
