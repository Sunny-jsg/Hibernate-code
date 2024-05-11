package com.ait.client;

import com.ait.dao.*;
import com.ait.dao.impl.*;
import com.ait.entity.ProductEntity;

public class Tester {
	public static void main(String[] args) {
		ProductDAO dao = new ProductDAOImpl();
		/*
		 * create a new product entity
		 */
		
		 /* ProductEntity pe = new ProductEntity(); 
		  pe.setProductid(102);
		  pe.setProductName("Mobile"); 
		  pe.setQuantity(13);
		  pe.setUnitPrice(18000.00);
		  dao.saveproduct(pe);
		 */
		//ProductEntity p = dao.updateproductById(101, 2200.00);
		//System.out.println(p );
		dao.EntityStates();
	}

}
