package Basics;

import java.util.Arrays;

public class Assignment_83 {
	// WAP to find out if the given 2 strings are anagram         

	public static void main(String[] args) {
		       
		String a = "stop";
		String b = "spot";
		if(a.length()!= b.length() )
		{
			System.out.println("They are not anagram");
		}
		else
		{
			System.out.println("ok. The lengh of two strings are are same");
			char c1[] = a.toCharArray();
			char c2[] = b.toCharArray();
			
			System.out.println("Before sorting c1 =" + Arrays.toString(c1));
			System.out.println("Before sorting c2 =" + Arrays.toString(c2));
			Arrays.sort(c1);
			Arrays.sort(c2);
			System.out.println("After sorting c1 =" + Arrays.toString(c1));
			System.out.println("After sorting c2 =" + Arrays.toString(c2));
			boolean b1 = Arrays.equals(c1, c2);
			if(b1==true)
			{
				System.out.println("They are Anagram");
			}
			else
			{
				System.out.println("They are not Anagram");
			}
			
			String x = "123455";
			char c4[] = x.toCharArray();
			System.out.println(Arrays.toString(c4));
			
			int [] rollno = new int[3];
			
			rollno[0] = 12;
			rollno[1] = 6;
			rollno[2] = 3;
			//System.out.println(Arrays.sort(rollno));
			Arrays.sort(rollno);
			System.out.println(Arrays.toString(rollno));
		}
		
		
		
		

	}

}
