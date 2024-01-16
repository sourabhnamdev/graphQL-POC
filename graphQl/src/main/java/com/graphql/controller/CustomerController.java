package com.graphql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.graphql.entity.Customer;
import com.graphql.service.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@QueryMapping("getAllCustomers")
	public List<Customer> getAllCustomers() {
		List<Customer> allCustomers = customerService.getAllCustomers();
		return allCustomers;
	}

	@QueryMapping("getCustomer")
	public Customer getCustomer(@Argument Integer id) {
		Customer customer = customerService.getCustomer(id);
		return customer;
	}
}
 