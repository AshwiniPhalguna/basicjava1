package Basics;

public class Assignment_13 {
	
	// WAP with combination of static and non static method
	
	void MUL()
	{
	int a = 50;
	int b = 10;
	
		System.out.println(a*b);
	}

	static void DIV()
	{
	int a = 50;
	int b = 10;
	
		System.out.println(a/b);
	}
	

	public static void main(String[] args) {
		
		DIV();
		Assignment_13 RF = new Assignment_13();
		RF.MUL();
		
		
		
	}

}
