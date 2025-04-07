package Basics;
//WAP on Access specifiers within class for methods

public class Assignment_55 {
	
	public static void add()
	{
		System.out.println("Addition");
	}
	protected static void sub()
	{
		System.out.println("Subtraction");
	}
	private  void mul()
	{
		System.out.println("Multiplication");
	}
	 static void Div()
	{
		System.out.println("Division");
	}

	public static void main(String[] args) {
		add();
		sub();
		Div();
		Assignment_55 RF = new Assignment_55();
		RF.mul();

	}

}
