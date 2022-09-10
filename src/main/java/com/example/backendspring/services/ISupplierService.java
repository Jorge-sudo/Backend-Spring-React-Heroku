package com.example.backendspring.services;

import com.example.backendspring.entities.Supplier;

import java.util.List;

public interface ISupplierService {
    List<Supplier> getAll();

    Supplier getById(Long id);
    void remove(Long id);
    public void save(Supplier c);
}
