package com.ait.otm.test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.List;

import com.ait.otm.dao.*;
import com.ait.otm.dao.impl.CategoryDAOImpl;
import com.ait.otm.entities.CategoryEntity;
import com.ait.otm.entities.ProductEntity;

public class Tester {

	public static void main(String[] args) throws Exception {
		CategoryDAO dao = new CategoryDAOImpl();
		/*
		 * Call saveCategory() method
		 */
		CategoryEntity ce = new CategoryEntity();
		ce.setCategoryId(211065);
		ce.setCategoryName("ELECTRONICS");
		ProductEntity pe = new ProductEntity();
		pe.setProductId(101);
		pe.setProductName("Mobile");
		File file = new File("D:\\images\\mobile2.jpeg");
		byte[] imagebytes = new byte[(int) file.length()];
		FileInputStream fis = new FileInputStream(file);
		fis.read(imagebytes);
		pe.setProductimage(imagebytes);
		ProductEntity pe1 = new ProductEntity();
		pe1.setProductId(202);
		pe1.setProductName("TV");
		File file1 = new File("D:\\images\\tv2.jpeg");
		byte[] imagebytes1 = new byte[(int) file1.length()];
		FileInputStream fis1 = new FileInputStream(file1);
		fis.read(imagebytes1);
		pe1.setProductimage(imagebytes1);
		ProductEntity pe2 = new ProductEntity();
		pe2.setProductId(301);
		pe2.setProductName("WATCH");
		File file2 = new File("D:\\images\\watch2.jpeg");
		byte[] imagebytes2 = new byte[(int) file2.length()];
		FileInputStream fis2 = new FileInputStream(file2);
		fis.read(imagebytes2);
		pe2.setProductimage(imagebytes2);
		ProductEntity pe3 = new ProductEntity();
		pe3.setProductId(401);
		pe3.setProductName("LAPTOP");
		File file3 = new File("D:\\images\\laptop1.jpeg");
		byte[] imagebytes3 = new byte[(int) file3.length()];
		FileInputStream fis3 = new FileInputStream(file3);
		fis.read(imagebytes3);
		pe3.setProductimage(imagebytes3);
		List<ProductEntity> lstOfProducts = Arrays.asList(pe,pe1,pe2,pe3);
		ce.setLstOfProducts(lstOfProducts);
		dao.saveCategory(ce);

	}

}
