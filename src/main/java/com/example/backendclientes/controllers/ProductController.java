package com.example.backendclientes.controllers;

import com.example.backendclientes.entities.Product;
import com.example.backendclientes.services.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private IProductService services;
    /** GET /customers -> Get all the customers from the database. */
    @GetMapping("/api/products")
    public List<Product> getAll (){
        return services.getAll();
    }

    /** GET /customers/{id} -> Get the "id" customer. */
    @GetMapping("/api/products/{id}")
    public Product getById (@PathVariable String id){
        return services.getById(Long.parseLong(id));
    }

    /** Delete /products -> Delete a product in the database. */
    @DeleteMapping ("/api/products/{id}")
    public void remove(@PathVariable String id) {
        services.remove(Long.parseLong(id));
    }

    /** POST /products -> Create a new product. */
    @PostMapping ("/api/products")
    public void save(@RequestBody Product product) {
        services.save(product);
    }
}
