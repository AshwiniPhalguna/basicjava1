package Basics;

import java.util.Scanner;

public class Assignment_33 {
	// WAP to print Area of Triangle using Scanner Class

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter the value of Base");
		int b = s1.nextInt();
		System.out.println("Please enter the value of Height");
		int h = s1.nextInt();
		double Area = 0.5*b*h;
		System.out.println(Area);
	}

}
