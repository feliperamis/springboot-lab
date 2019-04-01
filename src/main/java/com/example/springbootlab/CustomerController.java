package com.example.springbootlab;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootlab.model.Customer;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping(value = "/{customerId}")
    public Customer greeting(@PathVariable("customerId") String customerId){
        return customerService.getCostumer(customerId);
    }

    @PostMapping
    public String createCustomer(@RequestBody Customer customer){
        Customer persistedCustomer = customerService.saveCustomer(customer);
        return persistedCustomer.getId();
    }
}

