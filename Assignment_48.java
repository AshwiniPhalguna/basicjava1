package Basics;
//WAP to avoid Method Overiding using Final Method

class AccountPage
{
	final void addition()
	{
		System.out.println("addition a+b");
	}
}

public class Assignment_48 extends AccountPage{
	
	void addition1() //changed name as addition1 as addition is final method
	{
		System.out.println("addition c+d");
	}

	public static void main(String[] args) {
		Assignment_48 RF = new Assignment_48();
		RF.addition();
		
	}

}
