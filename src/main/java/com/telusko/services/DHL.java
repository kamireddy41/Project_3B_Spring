package com.telusko.services;

public class DHL implements DeliveryService 
{

	public DHL()
	{
		System.out.println("DHL bean is created");
	}
	
	@Override
	public Boolean deliverProduct(Double amount) 
	{
		System.out.println("Product delivered with DHL service and amount paid is : "+ amount);
		return true;
	}

}
