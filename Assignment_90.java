package Basics;

import java.util.ArrayList;
import java.util.Collection;

public class Assignment_90 {

	public static void main(String[] args) {
		// WAP on collection concept with the help of Upcasting on Different Data types (Int, Char, Double, string etc.)
		//with different methods like Add, Remove, Contains.

		Collection <Integer> c1 = new ArrayList<Integer>();
		c1.add(45);
		c1.add(95);
		c1.add(7200);
		System.out.println(c1);
		
		Collection <Integer> c2 = new ArrayList<Integer>();
		c2.add(100);
		c2.add(200);
		c2.add(5400);
		c2.addAll(c1);
		System.out.println(c2);
		c2.remove(100);
		System.out.println("After removing an object"+c2);
		c2.removeAll(c1);
		System.out.println("After removing collection"+c2);
		boolean b1 = c2.contains(200);
		System.out.println(b1);
		boolean b2 = c2.containsAll(c1);
		System.out.println(b2);
		
		
	}

}
