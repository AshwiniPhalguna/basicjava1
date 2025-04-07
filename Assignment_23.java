package Basics;

public class Assignment_23 {
	// WAP to update static and non static global variable
	int noofdays2025 = 365;
	static double salary = 50000;
	

	public static void main(String[] args) {
	
			int perday = 150;
			Assignment_23 RF = new Assignment_23();
			
			RF.noofdays2025 = 366;
			int salary2025 =RF.noofdays2025*perday;
			System.out.println(salary2025);
			
			salary = 80000;
			double bankbalance = 12*salary;
			System.out.println(bankbalance);
		

	}

}
