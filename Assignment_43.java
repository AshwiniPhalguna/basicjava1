package Basics;
//WAP on super calling statement using non-parameterized super calling statement

class HomePage {
	
	HomePage()
	{
		System.out.println("This is constructor of Home page");
	}
}

public class Assignment_43 extends HomePage {
	
	Assignment_43()
	{
		super();
		System.out.println("This is constructor of Assignment_43");
	}
	
	public static void main(String[] args) {
		
     new Assignment_43();
		


	}

}
