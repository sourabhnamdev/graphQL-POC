package com.graphql.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.graphql.entity.Customer;
import com.graphql.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	public List<Customer> getAllCustomers() {
		List<Customer> listcustomer = new ArrayList();
		Customer customer = new Customer();
		customer.setId(1);
		customer.setName("Sourabh Namdev");
		customer.setAge(24);
		customer.setAddress("8 Krishna Bagh Colony");
		customer.setMobileNumber("7067162527");

		Customer customer1 = new Customer();

		customer1.setId(2);
		customer1.setName("Rishabh Namdev");
		customer1.setAge(27);
		customer1.setAddress("8 Krishna Bagh Colony");
		customer1.setMobileNumber("6265164538");

		listcustomer.add(customer);
		listcustomer.add(customer1);
		return listcustomer;
	}

	@Override
	public Customer getCustomer(Integer id) {
		id=1;
		Customer customer = new Customer();
		customer.setId(1);
		customer.setName("Sourabh Namdev");
		customer.setAge(24);
		customer.setAddress("8 Krishna Bagh Colony");
		customer.setMobileNumber("7067162527");

		return customer;
	}

}
