package com.ecomm.test;

import static org.junit.Assert.assertNotNull;

import static org.junit.Assert.assertTrue;
import java.util.List;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ecomm.dao.OrderDAO;
import com.ecomm.entity.Order;


public class OrderDAOTest 
{
	static OrderDAO orderDAO; 
	
@BeforeClass
	
    public static void initialize()
    {
	AnnotationConfigApplicationContext appContext=new AnnotationConfigApplicationContext();
	appContext.scan("com.ecomm");
	appContext.refresh();
	orderDAO=(OrderDAO)appContext.getBean("orderDAO");
	
	}
    
@Test
public void addOrder()
{
	Order order=new Order();
	order.setOrderDate("07/10/20");
	order.setLoginName("Rahul");
	order.setAmount(45000);
	
	assertTrue("Problem in Inserting Order",orderDAO.addOrder(order));
}

@Test
public void getOrderTest()
{
	Order order=(Order)orderDAO.getOrder(1);
	assertNotNull(" Order not found",order);
	System.out.println("Order Date:"+order.getOrderDate());
	System.out.println("::::Login Name:"+order.getLoginName());
	System.out.println("::Amount of Order:"+order.getAmount());
}



@Test
public void getOrderList()
{
	List<Order> orderList=(List<Order>)orderDAO.getOrders();
	
	for(Order order:orderList)
	{
		System.out.println("Order Date:"+order.getOrderDate());
		System.out.println("::::Login Name:"+order.getLoginName());
		System.out.println("::Amount of Order:"+order.getAmount());
	}
}

}