package com.polymorphism;


//super/base/parent class
public class Organization
{
	int id;
	String name;
	
	public Organization() 
	{	
		id = 8080;
		name = "TCS";
	}
	
	public void getInformation()//method
	{
		System.out.println(id);
		System.out.println(name);
	}
	
}
