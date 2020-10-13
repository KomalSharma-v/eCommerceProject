package com.ecomm.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ecomm.entity.Cart;

@Repository("cartDAO")
@Transactional
public class CartDAOImpl  implements CartDAO
{
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public boolean addCart(Cart cart) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteCart(Cart cart) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateCart(Cart cart) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Cart getCart(int cartId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cart> getCarts() {
		// TODO Auto-generated method stub
		return null;
	}

}
