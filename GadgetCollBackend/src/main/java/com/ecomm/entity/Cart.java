package com.ecomm.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Cart 
{
	@Id
    @GeneratedValue(generator = "identity")
	
	int cartId;
    String cartItem;
    String cartItemDesc;
    
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public String getCartItem() {
		return cartItem;
	}
	public void setCartItem(String cartItem) {
		this.cartItem = cartItem;
	}
	public String getCartItemDesc() {
		return cartItemDesc;
	}
	public void setCartItemDesc(String cartItemDesc) {
		this.cartItemDesc = cartItemDesc;
	}
}
