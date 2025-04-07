package Basics;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		
		        //Area of Rectangle
				Scanner s1 = new Scanner(System.in);
				System.out.println("Please enter the value of Length");
				int l = s1.nextInt();
				System.out.println("Please enter the value of Width");
				int w = s1.nextInt();
				int Area = l*w;
				System.out.println(Area);
				
				//Circumference of Triangle
				int Circumference = 2*(l+w);
				System.out.println(Circumference);
				s1.close();
	}

}
