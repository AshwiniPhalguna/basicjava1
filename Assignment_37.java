package Basics;

import java.util.Scanner;

public class Assignment_37 {
	// WAP to print area of rectangle using Scanner Class


	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter the value of Length");
		int l = s1.nextInt();
		System.out.println("Please enter the value of Width");
		int w = s1.nextInt();
		int Area = l*w;
		System.out.println(Area);

	}

}
