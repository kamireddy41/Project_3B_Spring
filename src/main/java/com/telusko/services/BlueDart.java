package com.telusko.services;

public class BlueDart implements DeliveryService 
{

	public BlueDart()
	{
		System.out.println("Bluedart Bean created");
	}

	@Override
	public Boolean deliverProduct(Double amount) 
	{
		System.out.println("Product delivered with BlueDart service and amount paid is : "+ amount);
		return true;
	}

}
