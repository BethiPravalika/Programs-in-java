package com.Objectcloning;

	
	public class Department implements Cloneable
	{
		
		int deptId;
		String deptName;
		
		public Department() 
		{
			deptId = 3930;
			deptName = "Development";
		}
		
		public void getDepartmentInfo()
		{
			System.out.println(deptId);
			System.out.println(deptName);
		}
		
		public static void main(String[] args)throws CloneNotSupportedException
		{
			Department department = new Department();
			department.getDepartmentInfo();
			
			System.out.println("==================");
			
			Department department2 = (Department) department.clone();
			
			department2.getDepartmentInfo();
			
		}
		
	}



