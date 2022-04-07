package com.infy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.entity.Customer;
import com.infy.repository.CustomerRepository;

@Service
public class CustomerServiceImpl  implements CustomerService{
	
	@Autowired CustomerRepository repository;
	public List<Customer> getCustomers()
	{
		return (List<Customer>) repository.findAll();
	}
	@Override
	public Customer getCustomerDetails(int id) {
		Customer cust=repository.findById(id).get();
		return cust;
	}

}
