package com.example.backendclientes.services;

import com.example.backendclientes.entities.Customer;
import com.example.backendclientes.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService implements ICustomerService {

    @Autowired
    private CustomerRepository repository;

    @Override
    public List<Customer> getAll (){
       return (List<Customer> ) repository.findAll();
    }
}