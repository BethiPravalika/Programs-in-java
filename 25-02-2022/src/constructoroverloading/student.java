package constructoroverloading;

public class student {
	
	
	//variables(state)
	int id;
	String name;
	
	
	//constructor without parameters
	public student()
	{
		id=4676;
		name="Pravalika";
				
	}
	//constructor with parameters
		public student(int id, String name) 
		{
			this.id = id;
			this.name = name;
		}

		
		//method without parameters
		public void getInformation()
		{
			System.out.println(id);
			System.out.println(name);
}

		
		//main
		public static void main(String[] args) 
		{ 
			//objects
			student s1 = new student();
			s1.getInformation();
			
			System.out.println("===================");
			
			student s2 = new student(4676, "Pravalika");
			s2.getInformation();

		}	
		

	}

	
	



	
