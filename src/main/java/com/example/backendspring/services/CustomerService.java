package com.example.backendspring.services;

import com.example.backendspring.entities.Customer;
import com.example.backendspring.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService implements ICustomerService{
    //injectamos y que lo cargue automaticamente
    @Autowired
    private CustomerRepository repository;

    //este metodo nos traera todos los objetos pero llamando al repository
    @Override
    public List<Customer> getAll(){
        //devolvemos la lista de customers
        return (List<Customer>) repository.findAll();
    }

    @Override
    public Customer getById(Long id) {
        return (Customer)repository.findById(id).get();
    }

    @Override
    public void remove(Long id){
        repository.deleteById(id);
    }

    @Override
    public void save(Customer c){
        repository.save(c);
    }
}
