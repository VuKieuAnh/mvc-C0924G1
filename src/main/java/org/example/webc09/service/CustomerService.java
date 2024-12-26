package org.example.webc09.service;

import org.example.webc09.model.Customer;

import java.util.LinkedList;
import java.util.List;

public class CustomerService implements ICustomerService {
    private static List<Customer> customers = new LinkedList<>();
    static {
        customers.add(new Customer(1, "Son", "s@gmail.com", "1984294"));
        customers.add(new Customer(2, "Minh", "m@gmail.com", "1984294"));
        customers.add(new Customer(3, "Hoang", "h@gmail.com", "1984294"));
    }
    @Override
    public List<Customer> findAll() {
        return customers;
    }

    @Override
    public void save(Customer customer) {
        customers.add(customer);
    }
}
