package com.graphql.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.graphql.entity.Customer;

@Service
public interface CustomerService {
    List<Customer> getAllCustomers();
    Customer getCustomer(Integer id);
    
}
