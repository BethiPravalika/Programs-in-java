package com.aggregation;

public class Employee {

	//Variables
	int id;  
	String name;  
	Address address;  
//Constuctor
	public Employee(int id, String name,Address address) {  
	    this.id = id;  
	    this.name = name;  
	    this.address=address;  
	}  
//method
	void display(){  
	System.out.println(id+" "+name);
	System.out.println(address.city+" "+address.state+" "+address.country);  
	}  
//main
	public static void main(String[] args) {  
	Address address1=new Address("Nizamabad","Telangana","India");  
	Address address2=new Address("Suryapet","Telangana","India");  
//Objects
	Employee e=new Employee(111,"Sanvitha",address1); 
	Employee e2=new Employee(112,"Ranjitha",address2);  
	      
	e.display();  
	System.out.println("=========================");
	e2.display();  
	      
	}  
	}
		
				
				
	



