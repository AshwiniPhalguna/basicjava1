package Basics;

import java.util.Scanner;

public class Assignment_35 {
	// WAP to print area of square using Scanner Class

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter the value of side of square");
		int s = s1.nextInt();
		int Area = s*s;
		System.out.println(Area);
		
	}
}
