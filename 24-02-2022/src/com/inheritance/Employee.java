package com.inheritance;

	/**
	 * 
	 * Inheritance: The process of reusing one class properties from the another class
	 * ===========
	 *
	 */

	//sub/derived/child class
	public class Employee extends Organization
	{
		
		/**
		 * from the statement line 11 indicates that,
		 * 
		 * Employee is sub/derived/child class
		 * 
		 * and
		 * 
		 * Organization is super/base/parent class
		 * 
		 * Note: From Organization class id and name properties are reused by Employee class
		 */
		
		//variables(state)
		double salary;
		
		static String deptName;

		//constructors
		public Employee() 
		{
			id = 3939;
			name = "Ajay";
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
			System.out.println(id);
			System.out.println(name);
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
			organization.getInformation();
		}	
		

	}

	
	
	

	


