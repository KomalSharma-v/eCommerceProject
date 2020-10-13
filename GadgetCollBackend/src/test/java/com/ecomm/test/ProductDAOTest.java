package com.ecomm.test;

import static org.junit.Assert.assertNotNull;

import static org.junit.Assert.assertTrue;
import java.util.List;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ecomm.dao.ProductDAO;
import com.ecomm.entity.Product;

class ProductDAOTest 
{
	static ProductDAO productDAO;
	
@BeforeClass
	
    public static void initialize()
    {
	AnnotationConfigApplicationContext appContext=new AnnotationConfigApplicationContext();
	appContext.scan("com.ecomm");
	appContext.refresh();
	productDAO=(ProductDAO)appContext.getBean("productDAO");
	
	}

@Test
public void addProduct()
{
	Product product=new Product();
	product.setProductName("Vivo v5");
	product.setProductDesc("");
	product.setStock(1001);
	product.setPrice(44000);
	product.setCategoryId(2);
	product.setSupplierId(1);
	
	assertTrue("Problem in Inserting Category",productDAO.addProduct(product));
}

@Test
public void getOrderTest()
{
	Product product=(Product)productDAO.getProduct(1);
	assertNotNull("Product not found",product);
	System.out.println("Product Name:"+product.getProductName());
	System.out.println("::::Product Desc:"+product.getProductDesc());
	System.out.println("::::Product Desc:"+product.getStock());
	System.out.println("::::Product Desc:"+product.getPrice());
	System.out.println("::::Product Desc:"+product.getCategoryId());
	System.out.println("::::Product Desc:"+product.getSupplierId());
	
}

@Test
public void getProductList()
{
	List<Product> productList=(List<Product>)productDAO.getProducts();
	
	for(Product product:productList)
	{
		System.out.println("Product Name:"+product.getProductName());
	    System.out.println("::::Product Desc:"+product.getProductDesc());
	    System.out.println("::::Product Desc:"+product.getStock());
	    System.out.println("::::Product Desc:"+product.getPrice());
	    System.out.println("::::Product Desc:"+product.getCategoryId());
	    System.out.println("::::Product Desc:"+product.getSupplierId());
	}
}	
}
