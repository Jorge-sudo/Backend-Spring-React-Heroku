package com.example.backendspring.services;

import com.example.backendspring.entities.Employee;
import com.example.backendspring.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements  IEmployeeService{
    //injectamos y que lo cargue automaticamente
    @Autowired
    private EmployeeRepository repository;

    //este metodo nos traera todos los objetos pero llamando al repository
    @Override
    public List<Employee> getAll(){
        //devolvemos la lista de customers
        return (List<Employee>) repository.findAll();
    }

    @Override
    public Employee getById(Long id) {
        return (Employee)repository.findById(id).get();
    }

    @Override
    public void remove(Long id){
        repository.deleteById(id);
    }

    @Override
    public void save(Employee e){
        repository.save(e);
    }
}
