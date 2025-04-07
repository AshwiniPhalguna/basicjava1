package Basics;

import java.util.Scanner;

public class AreaOfSquare {

	public static void main(String[] args) {
		
		        //Area of Square
				Scanner s1 = new Scanner(System.in);
				System.out.println("Please enter the value of side of square");
				int s = s1.nextInt();
				int Area = s*s;
				System.out.println(Area);
				
				//Circumference of Circle
				int Circumference = 4*s;
				System.out.println(Circumference);
	}

}
