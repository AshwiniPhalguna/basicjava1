package Basics;

public class Assignment_71 {
	// WAP to reverse a string


	public static void main(String[] args) {
		String input = "Saksham";
		String output = "";
		for(int i = input.length()-1; i>=0; i--)
		{
			char a =input.charAt(i);
			output = output+a;
			
		}
		System.out.print("The reverse of the string is = "+ output);
		
		
	}

}
