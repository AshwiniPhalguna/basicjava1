package Basics;
//WAP on Inheritance Concept
class GoogleAuth1
{
	static void usrname() 
	{
		System.out.println("This is username");
	}
	void password()
	{
		System.out.println("This is password");
	}
}

public class Assignment_39 extends GoogleAuth1 {
	
	
	public static void main(String[] args) {
		GoogleAuth1.usrname();
		Assignment_39 RF = new Assignment_39();
		RF.password();
		
	}

}
