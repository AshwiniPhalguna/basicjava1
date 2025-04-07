package Basics;

import java.util.Scanner;

public class Assignment_34 {
	// WAP to print circumference of Triangle using Scanner Class

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter value of first side");
		int x =s1.nextInt();
		System.out.println("Please enter value of second side");
		int y =s1.nextInt();
		System.out.println("Please enter value of third side");
		int z =s1.nextInt();
		double Circumference = x+y+z;
		System.out.println(Circumference);
		s1.close();
	}

}
