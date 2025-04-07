package Basics;

import java.util.ArrayList;
import java.util.List;

public class Assignment_93 {
	// WAP on List concepts using its methods

	public static void main(String[] args) {
		List l1 = new ArrayList();
		l1.add("Book");
		l1.add("Laptop");
		l1.add(999);
		l1.add(true);
		l1.add('A');
		System.out.println(l1);
		l1.add("Notepad");
		l1.remove("Laptop");
		System.out.println(l1);
		l1.add(3, 1001);
		System.out.println(l1);
		
		List <String> l2 = new ArrayList<String>();
		l2.add("Ashwini");
		l2.add("Aarohi");
		System.out.println(l2);
		l2.addAll(l1);
		System.out.println(l2);
		l2.remove(2);
		System.out.println(l2);

	}

}
