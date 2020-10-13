package com.ecomm.test;

import static org.junit.Assert.assertNotNull;

import static org.junit.Assert.assertTrue;
import java.util.List;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ecomm.dao.SupplierDAO;
import com.ecomm.entity.Supplier;



 public class SupplierDAOTest 
 {
	 static SupplierDAO supplierDAO;

	 @BeforeClass
	    public static void initialize()
	    {
		AnnotationConfigApplicationContext appContext=new AnnotationConfigApplicationContext();
		appContext.scan("com.ecomm");
		appContext.refresh();
		supplierDAO=(SupplierDAO)appContext.getBean("supplierDAO");
		
		}
	    

	    @Test
	    public void addCategory()
	    {
	    	Supplier supplier=new Supplier();
	    	supplier.setSupplierName("Arun");
	    	supplier.setSupplierDesc("Local Supplier");
	    	
	    	assertTrue("Problem in Inserting Category",supplierDAO.addSupplier(supplier));
	    }
		
		@Test
		public void getCategoryTest()
		{
			Supplier supplier=(Supplier)supplierDAO.getSupplier(1);
			assertNotNull("category object not found",supplier);
			System.out.println("Category Name:"+supplier.getSupplierName());
			System.out.println("::::Category Desc:"+supplier.getSupplierDesc());
			
		}

		@Test
		public void getSupplierList()
		{
			List<Supplier> supplierList=(List<Supplier>)supplierDAO.getSuppliers();
			
			for(Supplier supplier:supplierList)
			{
				System.out.println("Category Name:"+supplier.getSupplierName());
				System.out.println("::::Category Desc:"+supplier.getSupplierDesc());
			}
		}	
	

	

}
