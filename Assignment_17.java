package Basics;

public class Assignment_17 {
	//WAP on constructor and call them
	
	Assignment_17()
	{
		System.out.println("This is constructor 1");
	}
	Assignment_17(String name, int age, char pwd)
	{
		System.out.println("This is constructor 2");
	}

	public static void main(String[] args) {
		
		
		
		new Assignment_17();
		new Assignment_17("Ashwini", 30, 'F');
	}

}
