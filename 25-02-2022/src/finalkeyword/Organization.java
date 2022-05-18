package finalkeyword;


//3. final keyword with class
//public final class Organization

public class Organization
{
	
	//1. final keyword with variable
	
	//final int id = 3030;
	
	int id;
	String name;
	
	public Organization() 
	{	
		id = 5050;//The final field Organization.id cannot be reassigned
		name = "Infosys";
	}
	
	//2. final keyword with method
	//public final void getInformation()
	//Cannot override the final method to sub class
	
	public void getInformation()
	{
		System.out.println(id);
		System.out.println(name);
	}
	
}
