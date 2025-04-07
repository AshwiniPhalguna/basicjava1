package Basics;

public class Assignment_20 {
	// WAP on Constructor Overloading
	Assignment_20()
	{
		System.out.println("This is constructor 1");
	}
	Assignment_20(int a)
	{
		System.out.println("This is constructor 2");
	}

	Assignment_20(int a,double b)
	{
		System.out.println(a+b);
	}
	Assignment_20(double b,int a)
	{
		System.out.println(a-b);
	}
	public static void main(String[] args) {
		
		new Assignment_20();
		new Assignment_20(25);
		new Assignment_20(30,10.5);
		Assignment_20 RF = new Assignment_20(50.5,10);
		
		
	}

}
