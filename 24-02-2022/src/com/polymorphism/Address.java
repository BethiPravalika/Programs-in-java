package com.polymorphism;


public class Address extends Organization
{

	int streetNo;
	String streetName;
	String city;
	
	public Address() {
	
		streetNo = 8393;
		streetName = "Vidhyanagar";
		city = "karimnagar";
	}
	
	public void getInformation()
	{
		System.out.println(streetNo);
		System.out.println(streetName);
		System.out.println(city);
	}
	
	public static void main(String[] args) {
		
		Address address = new Address();
		address.getInformation();
		
	}
}
