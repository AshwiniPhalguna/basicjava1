package Basics;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_77 {
	// WAP to accept the values of your array at run time

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("plz enter the size of an array");
		int [] rollno = new int[s1.nextInt()];
		
		for(int i=0; i<=rollno.length-1; i++)
		{
			System.out.println("Please enter the value of index position "+i);
			rollno[i] = s1.nextInt();
		}
		System.out.println(Arrays.toString(rollno));
		s1.close();

	}

}
