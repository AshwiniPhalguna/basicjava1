package Basics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Assignment_92 {
	// WAP to iterate a Collection using Iterator

	public static void main(String[] args) {
		Collection <Integer> c1 = new ArrayList <Integer>();
		c1.add(90);
		c1.add(120);
		c1.add(44);
		c1.add(100);
		Iterator<Integer> I1 = c1.iterator();
		System.out.println(I1.hasNext());
		//System.out.println(I1.next());
		
		while(I1.hasNext())
		{
			
			System.out.println(I1.next());
		}




	}

}
