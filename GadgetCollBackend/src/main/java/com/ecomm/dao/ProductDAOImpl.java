package com.ecomm.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ecomm.entity.Product;

@Repository("productDAO")
@Transactional
public class ProductDAOImpl implements ProductDAO {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public boolean addProduct(Product product) {
		try 
		{
			Session session = sessionFactory.getCurrentSession();
			 session.save(product);
			return true;
		}
		catch(Exception e)
		{
		return false;
		}
	}

	@Override
	public boolean deleteProduct(Product product) {
		try 
		{
		sessionFactory.getCurrentSession().delete(product);
		return true;
		}
		catch(Exception e)
		{
		return false;
		}	
	}

	@Override
	public boolean updateProduct(Product product) {
		try 
		{
		sessionFactory.getCurrentSession().update(product);
		return true;
		}
		catch(Exception e)
		{
		return false;
		}
	}

	@Override
	public Product getProduct(int productId) 
	{

		Session session=sessionFactory.openSession();
		Product product=session.get(Product.class,productId);
		session.close();
		return product;
	}
	

	@Override
	public List<Product> getProducts()
	{
		Session session=sessionFactory.openSession();
		List<Product> productList=session.createQuery("from Product").list();
		session.close();
		return productList;
	}

	
	}

	