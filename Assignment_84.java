package Basics;

import java.util.Arrays;

public class Assignment_84 {
	//WAP to count the number of alpahebets, numeric letters,spaces and special characters used in the given String                

	static int countalpha = 0;
	public static void main(String[] args) {
		String input = "Evere 1140";
		char[] array = input.toCharArray();
		System.out.println("Input array is" +Arrays.toString(array));
		for(int i=9; i<=array.length-1;i++)
		{
			boolean b1 = Character.isAlphabetic(array[i]);
			if(b1==true)
			{
				countalpha ++;
			}
			
		}
		System.out.println(countalpha);
	}
	 
}
