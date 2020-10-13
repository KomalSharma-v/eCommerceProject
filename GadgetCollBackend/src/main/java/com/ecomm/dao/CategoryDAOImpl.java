package com.ecomm.dao;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ecomm.entity.Category;

@Repository("categoryDAO")
@Transactional
public  class CategoryDAOImpl implements CategoryDAO
{

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public boolean addCategory(Category category) 
	{
		try 
		{
		 Session session = sessionFactory.getCurrentSession();
		 session.save(category);
		return true;
		}
		catch(Exception e)
		{
		return false;
		}
	}

	@Override
	public boolean deleteCategory(Category category)
	{
		try 
		{
			sessionFactory.getCurrentSession().delete(category);
			return true;
		}
		catch(Exception e)
		{
		return false;
		}
	}

	@Override
	public boolean updateCategory(Category category) {
		try 
		{
			sessionFactory.getCurrentSession().update(category);
			return true;
		}
		catch(Exception e)
		{
		return false;
		}
	}

	@Override
	public Category getCategory(int categoryId) {
		Session session=sessionFactory.openSession();
		Category category=session.get(Category.class,categoryId);
		session.close();
		return category;
	}

	@Override
	public List<Category> getCategories() {
		Session session=sessionFactory.openSession();
		List<Category> categoryList=session.createQuery("from Category").list();
		session.close();
		return categoryList;
	}

}
