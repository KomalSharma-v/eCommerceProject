package com.ecomm.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ecomm.entity.Customer;

@Repository("customerDAO")
@Transactional
public class CustomerDAOImpl implements CustomerDAO
{
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public boolean registerCustomer(Customer customer) {
		try 
		{
		 Session session = sessionFactory.getCurrentSession();
		 session.save(customer);
		return true;
		}
		catch(Exception e)
		{
		return false;
		}
	}

	@Override
	public Customer getCustomer(int loginName) {
		Session session=sessionFactory.openSession();
		Customer customer=session.get(Customer.class,loginName);
		session.close();
		return customer;
	}

	@Override
	public boolean updateCustomer(Customer customer) {
		try 
		{
			sessionFactory.getCurrentSession().update(customer);
			return true;
		}
		catch(Exception e)
		{
		return false;
		}
	}

	@Override
	public List<Customer> getCustomers() {
		Session session=sessionFactory.openSession();
		List<Customer> customerList=session.createQuery("from Customer").list();
		session.close();
		return customerList;
	}
}

	