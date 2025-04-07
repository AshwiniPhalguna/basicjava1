package Basics;

public class Assignment_9 {

	public static void main(String[] args) {
		
		// WAP on logical operators - AND, OR, AND NOT, OR NOT
		
		int a = 30;
		int b = 40;
		if(a==b && a<b)
		{
			System.out.println("condition 1");
		}
		if(a!=b && a<b)
		{
			System.out.println("codition 2");
		}
		if(a==b|| a<b)
		{
			System.out.println("condition 5");
		}
		if(!(a==b && a<b))
		{
			System.out.println("condition 3");
		}
		if(!(a!=b && a<b))
		{
			System.out.println("codition 4");
		}
		

	}

}
