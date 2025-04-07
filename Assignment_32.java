package Basics;

import java.util.Scanner;

public class Assignment_32 {
	// WAP to print Circumference of Circle using Scanner Class


	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter value of radius");
		int r1 =s1.nextInt();
		double Circumference = 2*Math.PI*r1;
		System.out.println(Circumference);
 
		
	}

}
