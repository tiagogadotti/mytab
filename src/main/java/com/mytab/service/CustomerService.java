package com.mytab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mytab.Repository.*;
import com.mytab.model.*;

@Service
public class CustomerService {

    private final CustomerRepository repository;

    @Autowired
    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public Customer getCustomer(Long id) {
        return repository.findById(id)
            .orElseThrow(() -> new RuntimeException("Customer not found"));
    }
}
