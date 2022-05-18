package finalkeyword;

//The type Employee cannot subclass/extends the final class Organization
public class Employee extends Organization
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
		name = "Sree";
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
		/**
		 * Cannot override the final method from Organization
		 */
		
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
