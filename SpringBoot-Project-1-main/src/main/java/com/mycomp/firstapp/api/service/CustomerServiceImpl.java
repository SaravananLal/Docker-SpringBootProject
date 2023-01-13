package com.mycomp.firstapp.api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mycomp.firstapp.api.dto.Customer;
import com.mycomp.firstapp.api.dto.Customers;
@Service
public class CustomerServiceImpl implements CustomerService {
	Customers allCustomers = new Customers();
	@Override
	public Customer addCustomer(Customer customer) {
		
		allCustomers.getCustomerList().add(customer);
		return customer;
	}

	@Override
	public List<Customer> getAllCustomer() {
		
		return allCustomers.getCustomerList();
	}

}
