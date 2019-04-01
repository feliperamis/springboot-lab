package com.example.springbootlab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springbootlab.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,String> {
}
