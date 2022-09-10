package com.example.backendspring.repository;

import com.example.backendspring.entities.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository                                         //<nameClass, idClass>
public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
