package com.example.backendclientes.services;

import com.example.backendclientes.entities.Product;

import java.util.List;

public interface IProductService {

    List<Product> getAll ();

    Product getById(Long id);

    void remove(Long id);

    void save(Product product);
}
