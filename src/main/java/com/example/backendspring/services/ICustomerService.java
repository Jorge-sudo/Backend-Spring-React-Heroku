package com.example.backendspring.services;

import com.example.backendspring.entities.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> getAll();

    Customer getById(Long id);
    void remove(Long id);
    public void save(Customer c);
}
