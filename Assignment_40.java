package Basics;
//WAP on Single Level Inheritance

class SLI
{
	static void add()
	{
		System.out.println("addition");
	}
	void sub() 
	{
		System.out.println("subtrction");
	}
}

public class Assignment_40 extends SLI {
	
	static void Mul()
	{
		System.out.println("multiplication");
	}

	public static void main(String[] args) {
		
		add();
		Mul();
		Assignment_40 obj = new Assignment_40();
		obj.sub();
		
	}

}
