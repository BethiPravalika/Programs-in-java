package com.abstraction;

//super//parent class
public class Organization {

	//private int id;
		int id;
		
		//private String name;
		String name;
		
		public Organization() 
		{	
			id = 5050;
			name = "Infosys";
		}
		
		public void getOrgInformation()
		{
			System.out.println(id);
			System.out.println(name);
		}
		
	}


