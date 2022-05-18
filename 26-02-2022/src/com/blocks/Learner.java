package com.blocks;

public class Learner {
	

	//non-static variables
	int id;
	String name;
	String dob;
	String address;
	
	//static variables
	static String country;
	
	public Learner() 
	{
		
	}
	
	//blocks
	
	//instance initializer block(we can initialize non-static variables in this block)
	{
		id = 3930;
		name = "Pravalika";
		dob = "08 Aug 1997";
		address = "Hyderabad";
	}
	
	//static block(static variables, we can initialize in this block.)
	static
	{
		country = "India";
	}
	
	//methods
	public void getInfo()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(dob);
		System.out.println(address);
		System.out.println(country);
	}
	
	public static void main(String[] args)
	{
		Learner learner1 = new Learner();
		learner1.getInfo();
	}

}



