package com.example.backendspring.services;

import com.example.backendspring.entities.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> getAll();

    Employee getById(Long id);

    void remove(Long id);

    public void save(Employee e);
}
