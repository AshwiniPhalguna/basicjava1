package Basics;

public class Assignment_14 {
	// 4 non static parameterized method
	
	 void sub(int a, int b)
	{
		System.out.println(a-b);
	}

	 void studentinfo(String name, int rollno)
		{
			System.out.println(name);
			System.out.println(rollno);			
		}
	void teacher(boolean a, boolean b)	
	{
		System.out.println(a);
		System.out.println(b);
	}
	 void div()
	 {
		 int a = 30;
		 int b = 20;
		 System.out.println(a/b);
	 }

	public static void main(String[] args) {
		Assignment_14 RF = new Assignment_14();
		RF.sub(50,300);
		RF.studentinfo("Ashwini", 77);
		RF.teacher(false, true);
		RF.div();
		
	}

}
