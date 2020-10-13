package com.ecomm.dao;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ecomm.entity.Supplier;

@Repository("supplierDAO")
@Transactional
public class SupplierDAOImpl implements SupplierDAO
{
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public boolean addSupplier(Supplier supplier) {
		try 
		{
		sessionFactory.getCurrentSession().save(supplier);
		return true;
		}
		catch(Exception e)
		{
		return false;
		}
	}

	@Override
	public boolean deleteSupplier(Supplier supplier) {
		try 
		{
			Session session = sessionFactory.getCurrentSession();
			 session.save(supplier);
			return true;
		}
		catch(Exception e)
		{
		return false;
		}
	}

	@Override
	public boolean updateSupplier(Supplier supplier) {
		try 
		{
		sessionFactory.getCurrentSession().update(supplier);
		return true;
		}
		catch(Exception e)
		{
		return false;
		}
	}

	@Override
	public Supplier getSupplier(int supplierId) {
		Session session=sessionFactory.openSession();
		Supplier supplier=session.get(Supplier.class,supplierId);
		session.close();
		return supplier;
	}

	@Override
	public List<Supplier> getSuppliers() {
		Session session=sessionFactory.openSession();
		List<Supplier> supplierList=session.createQuery("from Supplier").list();
		session.close();
		return supplierList;
	}

}
