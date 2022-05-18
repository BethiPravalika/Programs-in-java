package com.encapsulation;

public class Department {
	
	//variables(state)
		int id;
		String name;
		double salary;
		

		static String Organizationname;
		public Department() {
			id=5252;
			name="Srinu";
			salary=55562.48;
		}
		static
		{
			Organizationname = "Development";
		}
		
		public void getInformation()
		{
			System.out.println(id);
			System.out.println(name);
			System.out.println(salary);
			System.out.println(Organizationname);
		}
		
		public static void main(String[] args) 
		{ 
			//objects
			Department dep = new Department();
			dep.getInformation();
}


	
		
		
	}


