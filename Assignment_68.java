package Basics;

public class Assignment_68 {
	// Wap on String Function using toupperCase,toLowerCase,length,charAt,trim concepts

	public static void main(String[] args) {
		
		String input1 = "Ashwini K";
		int size = input1.length();
		System.out.println(size);
		
		String input2 = "Ashwini K";
		String a = input2.toUpperCase();
		System.out.println(a);
		

		String input3 = "ASHWINI K";
		String b = input3.toLowerCase();
		System.out.println(b);
		
		String input4 = " ASHWINI K  ";
		String c = input4.trim();
		System.out.println(c);
		
		String input5 = " ASHWINI K  ";
		 char d =  input5.charAt(7);
		System.out.println(d);
		
		
		
		
		
		

	}

}
