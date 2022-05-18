package superkeyword;

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
	
	public void getOrgInformation()
	{
		System.out.println(id);
		System.out.println(name);
	}
	
}
