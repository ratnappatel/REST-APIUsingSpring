package com.infy.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.infy.entity.Customer;
import com.infy.service.CustomerService;

@RestController
public class CustomerAPI {
	
	@Autowired CustomerService service;
	
	
	@GetMapping("/customers")
	public List<Customer> getCustomers()
	{
		return service.getCustomers();
	}
	
	@GetMapping("/customers/{id}")
	public Customer getCustomer(@PathVariable Integer id)
	{
		return service.getCustomerDetails(id);
	}

}
