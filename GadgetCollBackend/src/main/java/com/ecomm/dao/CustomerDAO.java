package com.ecomm.dao;

import java.util.List;

import com.ecomm.entity.Customer;

public interface CustomerDAO 
{
	public boolean registerCustomer(Customer customer);
	public Customer getCustomer(int loginName);
	public boolean updateCustomer(Customer customer);
	
	   public List<Customer> getCustomers();

}
