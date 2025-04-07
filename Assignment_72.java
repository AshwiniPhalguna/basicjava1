package Basics;

public class Assignment_72 {
	// WAP to check if the given string is a Palindrome?

	public static void main(String[] args) {
		
		String input = "radar";
		String output = "";
		
		for(int i = input.length()-1; i>=0; i--)
		{
			char a = input.charAt(i);
			output = output + a;
		}
		System.out.println("The reverse of string is - "+ output);
		if(input.equals(output))
		{
			System.out.println("The string is Palindrome");
		}

		else
		{
			System.out.println("The string is NOT Palindrome");
		}
	}

}
