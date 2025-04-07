package Basics;

public class Assignment_87 {
	// WAP on String Buffer using Append, insert, delete, substring, reverse, Capacity, replacea

	public static void main(String[] args) {
		
		StringBuffer S1 = new StringBuffer("Ashwini");
		
		System.out.println(S1.append(" Koteshwara"));
		;
		System.out.println(S1.insert(8, "Phalguna"));
		;
		System.out.println(S1.delete(8, 16));
			
		System.out.println(S1.replace(7, 18, ""));
		
		System.out.println(S1.reverse());
		System.out.println(S1.length());
		System.out.println(S1.capacity());
		
		StringBuffer S2 = new StringBuffer("Ram");
		System.out.println(S2.length());
		System.out.println(S2.capacity());
		
		StringBuffer s2 = new StringBuffer("Automation Testing");
		System.out.println(s2.substring(4));
		System.out.println(s2.substring(2, 12));
	}

}
