package Basics;

public class Assignment_16 {
	// WAP for Method overloading for static and non static method. 
	
	 static void mul(int a, int b)
	{
		System.out.println(a*b);
	}
	 static void mul(int a, int b, double c)
	 {
		 System.out.println(a*b*c);
	 }

	 void add(int a, double b)
	 {
		 System.out.println(a+b);
	 }
	 void add(double b, int a)
	 {
		 System.out.println(b*a);
	 }
	 void add( int a,int b,String c)
	 {
		 System.out.println("This is method overloading");
	 }
	 
	public static void main(String[] args) {
		mul(50,60);
		mul(35,45,20.4);
		Assignment_16 RF = new Assignment_16();
		RF.add(45, 25.7);
		RF.add(10.3, 30);
		RF.add(30, 20, "Ashwini");
		
		

	}

}
