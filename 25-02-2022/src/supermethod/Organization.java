package supermethod;

//super/parent class
public class Organization {
	
	int id;
	String name;
	
	public Organization()
	{
		id = 5056;
		name = "Delottie";
		System.out.println("Organization class constructor");
	}
	public void getInformation()//method
	{
		System.out.println(id);
		System.out.println(name);
	}
	
	

}
