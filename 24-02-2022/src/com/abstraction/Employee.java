package com.abstraction;


	/**
	 * 
	 * Abstraction: The process of hiding the properties of one class from the another class.
	 * ===========
	 *
	 */

	//sub/derived/child class
	public class Employee extends Organization
	{
		
		//variables(state)
		double salary;
		
		static String deptName;

		//constructors
		public Employee() 
		{
			id = 7989;
			name = "Ammu";
			salary = 48474.45;
		}

		//blocks
		static
		{
			deptName = "Development";
		}
		
		//methods(behavior)
		public void getInformation()
		{
			System.out.println(id);//The field Organization.id is not visible
			System.out.println(name);//The field Organization.name is not visible
			System.out.println(salary);
			System.out.println(deptName);
		}
		
		//main
		public static void main(String[] args) 
		{ 
			//objects
			Employee employee = new Employee();
			employee.getInformation();
			
			System.out.println("==============");
			
			Organization organization = new Organization();
			organization.getOrgInformation();
		}	
		

	}

	

