package com.telusko.services;


public class FedEx implements DeliveryService 
{

	public FedEx()
	{
		System.out.println("FedEx bean created");
	}
	@Override
	public Boolean deliverProduct(Double amount)
	{
		
		System.out.println("Product delivered with FedEx service and amount paid is : "+ amount);
		return true;
	}

}
