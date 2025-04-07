package Basics;

public class Assignment_18 {
	// WAP to declare a local vairable inside a static and non static Method
	
	static void add()
	{
		int a = 40;
		int b = 30;
		System.out.println(a+b);
	}
	void div()
	{
		int a = 350;
		int b = 50;
		System.out.println(a/b);
	}

	public static void main(String[] args) {
				
		add();
		Assignment_18 RF = new Assignment_18();
		RF.div();
		
	}

}
