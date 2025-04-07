package Basics;
//WAP on super calling statement using parameterized super calling statement

class LoginPage {
	
	LoginPage(int a, String b, double c)
	{
		System.out.println("This is constructor of Login page");
	}
}

public class Assignment_44 extends LoginPage{
	
	Assignment_44()
	{
		super(40,"Ashwini", 7.8);
		System.out.println("This is constructor of Assignment_44");
	}

	public static void main(String[] args) {
		new Assignment_44();
		

	}

}
