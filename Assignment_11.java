package Basics;

public class Assignment_11 {
	// WAP to call one non static method in main method
	
	void add()
	{
	int a = 50;
	int b = 40;
	
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		
		Assignment_11 RF = new Assignment_11();
		RF.add();
		
		

	}

}
