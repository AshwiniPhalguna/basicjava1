package Basics;

import java.util.Scanner;

public class Assignment_36 {
	// WAP to print circumference of square using Scanner Class

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter the value of side of square");
		int s = s1.nextInt();
		int Circumference = 4*s;
		System.out.println(Circumference);

	}

}
