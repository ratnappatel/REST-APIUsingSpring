package com.infy.service;

import java.util.List;

import com.infy.entity.Customer;

public interface CustomerService {

	public List<Customer> getCustomers();
	public Customer getCustomerDetails(int id);
}
