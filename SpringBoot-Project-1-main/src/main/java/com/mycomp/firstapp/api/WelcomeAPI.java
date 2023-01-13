package com.mycomp.firstapp.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycomp.firstapp.api.dto.Customer;
import com.mycomp.firstapp.api.service.CustomerService;

@RestController
@RequestMapping("/api")
public class WelcomeAPI {
	@Autowired
	private CustomerService customerService;
	@GetMapping("/messages")
	public String getMessage() {
		return "Welcome To Restful web services";
	}
	@GetMapping("/messages/date")
	public String getDate() {
		return new java.util.Date().toString();
	}
	
    @PostMapping("/customers")
    public Customer addCustomer(@RequestBody Customer customer) {
    	return customerService.addCustomer(customer);
    }
    @GetMapping("/customers")
    public List<Customer> getAllCustomer(){
    	return customerService.getAllCustomer();
    }
}
