package Basics;
//WAP on this calling statement

public class Assignment_45 {
	
	Assignment_45(double a)
	{
		this(58,9.7);
		System.out.println("constructor 1");
	}
	Assignment_45(int a, String b)
	{
		this();
		System.out.println("constructor 2");
	}
	Assignment_45()
	{
		this(5.7);
		System.out.println("constructor 3");
	}
	Assignment_45(int a, double b)
	{
		System.out.println("constructor 4");
	}
		
	public static void main(String[] args) {
		
		new Assignment_45(45,"Ashwini");	
		

	}

}
