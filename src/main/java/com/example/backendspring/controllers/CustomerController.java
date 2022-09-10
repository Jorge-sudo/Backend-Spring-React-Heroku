package com.example.backendspring.controllers;
import com.example.backendspring.entities.Customer;
import com.example.backendspring.services.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
public class CustomerController {
    //aplicamos injeccion de dependencias
    @Autowired
    private ICustomerService service;
    @GetMapping("/api/customers")
    public List<Customer> getAll(){
        return service.getAll();
    }
    @GetMapping("/api/customers/{id}")
    public Customer getById(@PathVariable String id){
        return service.getById(Long.parseLong(id));
    }
    @DeleteMapping ("/api/customers/{id}")
    public void remove(@PathVariable String id){
        service.remove(Long.parseLong(id));
    }

    @PostMapping("/api/customers")
    public void save(@RequestBody Customer c){
        service.save(c);
    }

}
