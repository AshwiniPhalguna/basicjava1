package Basics;

public class StringFunctions {

	public static void main(String[] args) {
		
		String input = "ASHWINI";
		int size = input.length();
		System.out.println(size);
		System.out.println(input.toLowerCase());
		String input1 = "ashwini";
		System.out.println(input1.toUpperCase());
		String input2 = " My name is ASHWINI ";
		System.out.println(input2.trim());
		String input3 = "ashwini";
		System.out.println(input1.equals(input3));
		System.out.println(input1.equalsIgnoreCase(input3));
		String input4 = "ashwini koteshwara";
		System.out.println(input4.contains(input3));
		
		System.out.println(input4.substring(5));
		System.out.println(input4.subSequence(2, 12));
		
		
	}

}
