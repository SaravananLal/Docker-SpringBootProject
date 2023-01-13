package com.mycomp.firstapp.api.dto;

import java.util.ArrayList;
import java.util.List;

public class Customers {
private List<Customer> customerList = new ArrayList<Customer>();

public Customers() {
	super();
	
}

public Customers(List<Customer> customerList) {
	super();
	this.customerList = customerList;
}

public List<Customer> getCustomerList() {
	return customerList;
}

public void setCustomerList(List<Customer> customerList) {
	this.customerList = customerList;
}

}
