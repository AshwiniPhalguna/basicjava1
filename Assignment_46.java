package Basics;
//WAP on Super Keyword
class Precondition{
	
	void HomePage() 
	{
		System.out.println("Login to HomePage by mobile no");
	}
}

public class Assignment_46 extends Precondition {
	
	void HomePage() 
	{
		super.HomePage();
		System.out.println("Login to HomePage by email id  ");
	}

	public static void main(String[] args) {
		
		Assignment_46 RF = new Assignment_46();
		RF.HomePage();
		
	}

}
