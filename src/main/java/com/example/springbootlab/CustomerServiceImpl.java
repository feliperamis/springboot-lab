package com.example.springbootlab;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.springbootlab.model.Customer;
import com.example.springbootlab.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;



    @Override public Customer getCostumer(String customerId) {
       return customerRepository.findOne(customerId);
    }

    @Override public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}
