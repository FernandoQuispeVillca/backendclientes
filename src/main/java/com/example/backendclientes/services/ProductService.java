package com.example.backendclientes.services;

import com.example.backendclientes.entities.Product;
import com.example.backendclientes.repository.CustomerRepository;
import com.example.backendclientes.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService implements IProductService {

    @Autowired
    private ProductRepository repository;

    @Override
    public List<Product> getAll (){
        return (List<Product> ) repository.findAll();
    }

    @Override
    public Product getById(Long id) {
        return (Product)repository.findById(id).get();
    }

    @Override
    public void remove(Long id) {
        repository.deleteById(id);
    }

    @Override
    public void save(Product product) {
        repository.save(product);
    }
}