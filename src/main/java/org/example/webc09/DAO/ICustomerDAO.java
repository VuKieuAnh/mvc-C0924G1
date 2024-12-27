package org.example.webc09.DAO;

import org.example.webc09.model.Customer;

import java.util.List;

public interface ICustomerDAO {
    List<Customer> findAll();
    void save(Customer customer);
}
