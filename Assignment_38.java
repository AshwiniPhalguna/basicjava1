package Basics;

import java.util.Scanner;

public class Assignment_38 {
	// WAP to print circumference of rectangle using Scanner Class

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter the value of Length");
		int l = s1.nextInt();
		System.out.println("Please enter the value of Width");
		int w =s1.nextInt();
		int Circumference = 2*(l+w);
		System.out.println(Circumference);
		s1.close();
		

	}

}
