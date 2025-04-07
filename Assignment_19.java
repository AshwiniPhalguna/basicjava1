package Basics;

public class Assignment_19 {
	// WAP to declare a Global variable.
	
	static double PI = 3.14;
	int noofdaysfeb = 28;
	public static void Area() 
	{
		int radius = 15;
		double area = PI*radius*radius;
		System.out.println(area);
		
	}

	public static void main(String[] args) {
		Area();
		int perday = 200;
		Assignment_19 RF = new Assignment_19();
		int salaryoffeb = perday*RF.noofdaysfeb;
		System.out.println(salaryoffeb);

	}

}
