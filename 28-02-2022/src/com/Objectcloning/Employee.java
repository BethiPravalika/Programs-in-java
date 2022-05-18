package com.Objectcloning;

public class Employee {
	
	int id;
	 String name;
	 double salary;
	 
	 public Employee()
	 {
		 id=4589;
		 name="'Pravalika";
		 salary=35789.25;
	 }
	 public void getEmployeeInfo()
		{
			System.out.println(id);
			System.out.println(name);
			System.out.println(salary);
		}
	 public static void main(String[] args)throws CloneNotSupportedException
		
	 {
		 Employee emp1 = new Employee();
		 emp1.getEmployeeInfo();
			
			System.out.println("==================");
			
			Employee emp2 = new Employee();
			
			emp2.getEmployeeInfo();
	 }
	 

}
