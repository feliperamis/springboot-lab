package com.example.springbootlab;

import java.util.Optional;

import com.example.springbootlab.model.Customer;

public interface CustomerService {

    Customer getCostumer(String customerId);

    Customer saveCustomer(Customer customer);
}
