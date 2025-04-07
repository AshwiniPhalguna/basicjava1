package Basics;

public class Assignment_15 {
	// WAP on 3 static parameterized method
	
	static void add(int a, int b)
	{
		System.out.println(a+b);
	}

	static void name(String name)
	{
		System.out.println(name);
	}

	static void studentinfo(String name, char gender, double salary)
	{
		System.out.println(name);
		System.out.println(gender);
		System.out.println(salary);
	}
	
	public static void main(String[] args) {
		
		add(65, 45);
		name("Ashwini");
		studentinfo("Amit", 'M', 50000);
		

	}

}
