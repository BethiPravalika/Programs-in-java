package coVariantReturnTypes;

//super/base/parent class
public class Organization
{
	int id;
	String name;
	
	public Organization() 
	{	
		id = 5050;
		name = "Infosys";
	}
	
	public Organization getInformation()//method
	{
		System.out.println(id);
		System.out.println(name);
		return null;
	}
	
}
