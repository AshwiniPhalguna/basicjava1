package Basics;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		
		//Area of Circle
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter the value of Radius");
		int r = s1.nextInt();
		double Area = Math.PI*r*r;
		System.out.println(Area);
		
		//Circumference of Circle
		System.out.println("Please enter value of radius");
		int r1 =s1.nextInt();
		double Circumference = 2*Math.PI*r1;
		System.out.println(Circumference);
 
		
		
	}
	
	

}
