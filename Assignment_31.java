package Basics;

import java.util.Scanner;

public class Assignment_31 {
	// WAP to print Area of Circle using Scanner Class

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter the value of Radius");
		int r = s1.nextInt();
		double Area = Math.PI*r*r;
		System.out.println(Area);
		

	}

}
