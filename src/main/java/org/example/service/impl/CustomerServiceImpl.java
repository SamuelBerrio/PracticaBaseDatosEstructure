package org.example.service.impl;

import org.example.model.Customer;
import org.example.service.CustomerService;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    List<Customer> customersList = new ArrayList<>();

    public List<Customer> getCustomersList() {
        return customersList;
    }


}
