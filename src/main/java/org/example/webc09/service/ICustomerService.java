package org.example.webc09.service;

import org.example.webc09.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();
    void save(Customer customer);
}
