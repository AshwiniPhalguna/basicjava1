package Basics;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		

		//Area of Triangle
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter the value of Base");
		int b = s1.nextInt();
		System.out.println("Please enter the value of Height");
		int h = s1.nextInt();
		double Area = 0.5*b*h;
		System.out.println(Area);
		
		//Circumference of Triangle
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
