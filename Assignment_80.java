package Basics;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_80 {
	// WAP to copy one array into another array in reverse order

	public static void main(String[] args) {
		
		Scanner S1 = new Scanner(System.in);
		System.out.println("Please enter the size of your array");
		int input[] = new int[S1.nextInt()];
		int output[] = new int[input.length];
		for(int i = 0, j=input.length-1; i<=input.length-1; i++,j--)
		{
			output[j] = input[i];
		}
		System.out.println("Input Array is " + Arrays.toString(input));
		System.out.println("Input Array is " + Arrays.toString(output));
		
	}

}
