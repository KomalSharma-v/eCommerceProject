package com.ecomm.test;

import static org.junit.Assert.assertNotNull;

import static org.junit.Assert.assertTrue;
import java.util.List;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ecomm.dao.CustomerDAO;
import com.ecomm.entity.Customer;

public class CustomerDAOTest 
{
	static CustomerDAO customerDAO;
	
	@BeforeClass
    public static void initialize()
    {
	AnnotationConfigApplicationContext appContext=new AnnotationConfigApplicationContext();
	appContext.scan("com.ecomm");
	appContext.refresh();
	customerDAO=(CustomerDAO)appContext.getBean("customerDAO");
	
	}

	@Test
    public void registerCustomer()
    {
    	Customer customer=new Customer();
    	customer.setPassword("123");
    	customer.setCustomerName("Rahul");
    	customer.setEmailId("rahul@gmailcom");
    	customer.setMobileNo("677889999");
    	customer.setCustomerAddr("Raghavpuram,Jharkhand");
    	
    	assertTrue("Problem in Inserting Customer",customerDAO.registerCustomer(customer));
    }
	@Test
	public void getCustomerTest()
	{
		Customer customer=(Customer)customerDAO.getCustomer(1);
		assertNotNull("customer  not found",customer);
		System.out.println("Password:"+customer.getPassword());
		System.out.println("::::Customer Name:"+customer.getCustomerName());
		System.out.println("::::Customer EmailId:"+customer.getEmailId());
		System.out.println("::::Customer Mobile No:"+customer.getMobileNo());
		System.out.println("::::Customer Address:"+customer.getCustomerAddr());
		
	}

	@Test
	public void getCustomerList()
	{
		List<Customer> customerList=(List<Customer>)customerDAO.getCustomers();
		
		for(Customer customer:customerList)
		{
			System.out.println("Password:"+customer.getPassword());
			System.out.println("::::Customer Name:"+customer.getCustomerName());
			System.out.println("::::Customer EmailId:"+customer.getEmailId());
			System.out.println("::::Customer Mobile No:"+customer.getMobileNo());
			System.out.println("::::Customer Address:"+customer.getCustomerAddr());
		}
        }
}