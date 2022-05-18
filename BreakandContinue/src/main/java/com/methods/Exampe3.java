package com.methods;

import java.util.Scanner;

public class Exampe3 {

	public static void main(String[] args) {


		//Scanner: by using this class object we can read the data from keyboard(external device)
		
		Scanner scanner = new Scanner(System.in);
		
		int num1, num2, sum, sub, product, division, mode;
		
		System.out.println("Enter First Value: ");
		num1 = scanner.nextInt();
		
		System.out.println("Enter Second Value: ");
		num2 = scanner.nextInt();
		
		sum = num1+num2;
		
		System.out.println("Sum: "+sum);		
	}

}
