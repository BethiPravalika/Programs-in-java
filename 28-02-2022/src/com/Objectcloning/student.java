package com.Objectcloning;

public class student {
	
//To Do Cloning we have to follow these steps

	//step1: class should implements 'Cloneable' interface 
	public class Student implements Cloneable
	{

		//variables
		int rollNo;
		String name;
		int marks;
		String address;
		
		//constructor
		public Student() 
		{
			rollNo = 3030;
			name = "Sree";
			marks = 59;
			address = "Hyderabad";
			
		}
		
		public void getInfo()
		{
			System.out.println(rollNo);
			System.out.println(name);
			System.out.println(marks);
			System.out.println(address);
		}
		
		//step2: should declare CloneNotSupportedException exception class
		public void main(String[] args) throws CloneNotSupportedException
		{
		
			//step3: create at least one object with new keyword and constructor 
			System.out.println("=========using new keyword=========");
			
			Student student2 = new Student();
			student2.getInfo();
			
			System.out.println("=========using clone() method=========");
			
			/**
			 * step4: by using existing object reference we have to call
			 * clone() method and type cast it. 
			 */
					
			Student student3 = (Student) student2.clone();
			student3.getInfo();
			
		}
		
	}


}
