package Basics;

import java.util.Scanner;

public class Assignment_76 {
	// Find out the average of all the numbers present in your array


	public static void main(String[] args) {
		
		double sum = 0;
		double average;
		
		Scanner s1 = new Scanner (System.in);
		System.out.println("Enter the size of your erray");
		double [] array = new double [s1.nextInt()];
		for(int i= 0; i<=array.length-1; i++)
		{
			System.out.println("plz enter the value of array at index "+i);
			array[i] = s1.nextDouble();
			sum = sum+array[i];
		}
		
		System.out.println("The sum of values of arrays "+sum);
		average = sum/array.length;
		System.out.println("Average of the array is" +average);
		s1.close();
	}

}
