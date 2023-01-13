package com.mycomp.firstapp.api.service;

import java.util.List;

import com.mycomp.firstapp.api.dto.Customer;

public interface CustomerService {

	Customer addCustomer(Customer customer);

	List<Customer> getAllCustomer();

}
