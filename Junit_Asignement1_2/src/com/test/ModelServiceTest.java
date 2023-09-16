package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.controller.Model;
import com.service.ProductService;

public class ModelServiceTest 
{
	@Test
	public void testIncreasePriceByCategory()
	
	{
		Model mobileProduct=new Model(1,"mobile phone",500.0,"Mobiles");
		ProductService productService=new ProductService(); 
		Model updatedProductPrice=productService.IncreasePriceByCategory(mobileProduct);
		assertEquals(510.0,updatedProductPrice.getPrice(),0.01);
	}
	@Test
	public void testIncreasePriceByLaptops()
	{
		Model LaptopProduct=new Model(1,"Laptops_hp",1000.0,"Laptops"); //object of model class
		ProductService productservice=new ProductService();				//object of service class
		Model updatedproducteprice=productservice.IncreasePriceByCategory(LaptopProduct); //adding both classes values
		assertEquals(1010.0,updatedproducteprice.getPrice(),0.01);
	}
	@Test
	public void testtotalPrice()
	{
		Model []model= {new Model (1,"product 1",100.0,"Category a"),
						new Model (2,"Product 2",200.0,"Category b"),
						new Model (3,"product 3",300.0,"Category c")}; 
		ProductService productService=new ProductService(); 
		double totalPrice=productService.totalPrice(model);
		assertEquals(600.0,totalPrice,0.01);
	}
	
	@Test
	public void tetsComputeGreaterPrice(ProductService productservice)
	{
		ProductService productService= new ProductService();
		Model p1=new Model(1,"Mobile",500,"Mobiles");
		Model p2=new Model(2,"Laptop",1000.0,"Laptops");
		productService.ComputeGreaterPrice(p1, p2);
	}
	


}
