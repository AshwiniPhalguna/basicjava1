package Basics;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_79 {
	// WAP to copy one array into another array

	public static void main(String[] args) {
		
		/*Scanner s1 =new Scanner(System.in);
		System.out.println("Please enter the size of your array");
		int[] answer = new int[s1.nextInt()];
		
		for(int i=0; i<=answer.length-1; i++)
		{
			System.out.println("Please enter the value at the index position"+ i);
			answer[i]= s1.nextInt();
		}

		
		System.out.println("This is your input array"+Arrays.toString(answer));
		int[] answer1 = new int[answer.length];
		
		for(int j=0; j<=answer1.length-1; j++)
		{
			answer1[j] = answer[j];
		}
		
		System.err.println("This is your copied array"+ Arrays.toString(answer1));
		
		int [] answer2 =answer1.clone();
		System.out.println("After using clone method" +Arrays.toString(answer2));
		//Arrays.copyOf(null, 0)*/
		
		int [] roll = new int[3];
		System.out.println(Arrays.toString(roll));
		
	}

}
