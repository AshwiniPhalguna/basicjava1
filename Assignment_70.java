package Basics;

public class Assignment_70 {
	// WAP on String Function using equals and equalsIgnoreCase concept

	public static void main(String[] args) {
		
		String input = "Ashwini";
		String output = "Ashwini";
		boolean b1 = input.equals(output);
		
		System.out.println(b1);
		
		String input1 = "Ashwini";
		String output2 = "ashwini";
		boolean b2 = input.equalsIgnoreCase(output2);
		System.out.println(b2);

	}

}
