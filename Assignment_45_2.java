package Basics;
//WAP on method overriding

class LoginPage1{

	void LoginByEmail() 
	{
		System.out.println("Loin using Email1");
	}
}

public class Assignment_45_2 extends LoginPage1  {
	
	void LoginByEmail() 
	{
		System.out.println("Loin using Email2");
	}
	
	
	public static void main(String[] args) {
		Assignment_45_2 RF = new Assignment_45_2();
		RF.LoginByEmail();

	}

}
