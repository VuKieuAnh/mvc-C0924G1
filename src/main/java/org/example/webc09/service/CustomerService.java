package org.example.webc09.service;

import org.example.webc09.DAO.CustomerDAO;
import org.example.webc09.DAO.ICustomerDAO;
import org.example.webc09.model.Customer;

import java.util.LinkedList;
import java.util.List;

public class CustomerService implements ICustomerService {
//    du lieu cung
    ICustomerDAO customerDAO = new CustomerDAO();

    @Override
    public List<Customer> findAll() {
        return customerDAO.findAll();
    }

    @Override
    public void save(Customer customer) {
        customerDAO.save(customer);
    }
}
