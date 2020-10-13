package com.ecomm.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ecomm.entity.Order;

@Repository("orderDAO")
@Transactional
public class OrderDAOImpl implements OrderDAO {
	
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public boolean addOrder(Order order) 
	{
		try 
		{
		 Session session = sessionFactory.getCurrentSession();
		 session.save(order);
		return true;
		}
		catch(Exception e)
		{
		return false;
		}
	}

	@Override
	public boolean deleteOrder(Order order) {
		try 
		{
			sessionFactory.getCurrentSession().delete(order);
			return true;
		}
		catch(Exception e)
		{
		return false;
		}
	}

	@Override
	public boolean updateOrder(Order order) 
	{
		try 
		{
			sessionFactory.getCurrentSession().update(order);
			return true;
		}
		catch(Exception e)
		{
		return false;
		}

	}

	@Override
	public Order getOrder(int orderId) {
		Session session=sessionFactory.openSession();
		Order order=session.get(Order.class,orderId);
		session.close();
		return order;
	}

	@Override
	public List<Order> getOrders() {
		Session session=sessionFactory.openSession();
		List<Order> orderList=session.createQuery("from Order").list();
		session.close();
		return orderList;
	}

}
