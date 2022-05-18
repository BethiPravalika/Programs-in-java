package com.encapsulation;

public class Patient {


		int id;
		String name;
		
		static String Consultantdoctor;
		public Patient() {
			id=1252;
			name="Prathima";
			
		}
		static
		{
			Consultantdoctor="Harish";
		}
			
		public void getPatientInformation()
		{
			System.out.println(id);
			System.out.println(name);
			//System.out.println(address);
			System.out.println(Consultantdoctor);
		}
		
		public static void main(String[] args) 
		{ 
			
			Patient patient = new Patient();
			patient.getPatientInformation();
			
				}

}
