package com.encapsulation;


		
		/**Encapsulation: The process of binding variables(state) and methods(behavior) in a
		 * =============  single unit.
		 *
		 */
		public class Employee 
		{
			
			//variables(state)
			int id;
			String name;
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
	}

}
