package Basics;

public class Assignment_22 {
	// WAP for static and non static global varibles and utilize them in both static and non static methods
	
	int noofdays2025 = 365;
	static double PI = 3.14;
	
	static void salary() 
	{
		int perday = 150;
		Assignment_22 RF = new Assignment_22();
		
		int salary2025 =RF.noofdays2025*perday;
		System.out.println(salary2025);
		
	}
	
	void perimeterofcircle() 
	{
		int r = 10;
		double perimeter = PI*2*r;
		System.out.println(perimeter);
				
	}

	public static void main(String[] args) {
		salary();
		Assignment_22 RF = new Assignment_22();
		RF.perimeterofcircle();
		

	}

}
