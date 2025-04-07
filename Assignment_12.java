package Basics;

public class Assignment_12 {
	//WAP to call 3 non static method in main method
	
	int a = 50;
	int b = 40;
	void add()
	{
		System.out.println(a+b);
	}
	void sub()
	{
		System.out.println(a-b);
	}
	void mul()
	{
		System.out.println(a*b);
	}
	
	public static void main(String[] args) {
		
		Assignment_12 RF = new Assignment_12();
		RF.add();
		RF.sub();
		RF.mul();

	
		

	}

}
