package com.service;

import com.controller.Model;

public class ProductService 
{
	public Model IncreasePriceByCategory(Model P)
	{
		if(P.getCategory().equalsIgnoreCase("Mobiles"))
		{
			double currentPrice=P.getPrice();
			double newPrice=currentPrice*1.02;
			P.setPrice(newPrice);
			
		}
		else if(P.getCategory().equalsIgnoreCase("laptops"))
		{
			double currentPrice=P.getPrice();
			double newPrice=currentPrice*1.01;
			P.setPrice(newPrice);
		}
		return P;
	}
	public double totalPrice(Model[] P)
	{
		double totalPrice=0.0;
		for(Model model:P)
		{
			totalPrice+=model.getPrice();
		}
		return totalPrice;
	}
	public void ComputeGreaterPrice(Model m1,Model m2)
	{
		if(m1.getPrice() > m2.getPrice())
		{
			System.out.println(m1.getTitle()+"has greater price than"+m2.getTitle());
		}
		else if(m1.getPrice() >m2.getPrice())
		{
			System.out.println(m2.getTitle()+"has greter price than"+m1.getTitle());
		}
		else
		{
			System.out.println(m1.getTitle()+"and"+m2.getTitle()+"has the same price");
		}
	}
	
}
