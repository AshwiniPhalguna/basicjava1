package Basics;

public class Assignment_88 {
	// WAP on String Builder using Append, insert, delete, substring, reverse, Capacity, replace

	public static void main(String[] args) {
		
		StringBuilder str = new StringBuilder("Belgium");
		System.out.println(str.append(" Brussels"));
		System.out.println(str.insert(8, 1140));
		System.out.println(str.delete(8, 12));
		System.out.println(str.reverse());
		System.out.println(str.capacity());
		System.out.println(str.replace(9, 16, "Ashwini"));
		System.out.println(str.substring(5));

		StringBuilder strB = new StringBuilder("Ashwini K");
		String output = strB.substring(3);
		System.out.println(output);
		String output1 = strB.substring(2, 5);
		System.out.println(output1);
	}

}
