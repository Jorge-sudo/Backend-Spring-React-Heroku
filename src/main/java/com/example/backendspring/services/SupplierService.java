package com.example.backendspring.services;

import com.example.backendspring.entities.Supplier;
import com.example.backendspring.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierService implements ISupplierService{
    //injectamos y que lo cargue automaticamente
    @Autowired
    private SupplierRepository repository;

    //este metodo nos traera todos los objetos pero llamando al repository
    @Override
    public List<Supplier> getAll(){
        //devolvemos la lista de customers
        return (List<Supplier>) repository.findAll();
    }

    @Override
    public Supplier getById(Long id) {
        return (Supplier)repository.findById(id).get();
    }

    @Override
    public void remove(Long id){
        repository.deleteById(id);
    }

    @Override
    public void save(Supplier s){
        repository.save(s);
    }
}
