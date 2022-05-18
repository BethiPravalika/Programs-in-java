package supermethod;

//sub/derived/child class
public class Employee extends Organization
{
	
	//variables(state)
	double salary;
	
	static String deptName;

	//constructors
	public Employee() 
	{
		super();
		id = 3939;
		name = "sony";
		salary = 48474.45;
		System.out.println("Employee class constructor");
	}

	//blocks
	static
	{
		deptName = "Development";
	}
	
	//methods(behavior)
	public void getInformation()//overrides com.polymorphism.Organization.getInformation()
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
		
		
	}	
	

}
	
	