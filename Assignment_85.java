package Basics;

public class Assignment_85 {
	// WAP on string functions using replace, replaceAll, substring, matches, repeat

	public static void main(String[] args) {
		
		String input = "Ashwini";
		String output =input.replace('s', 'k');
		System.out.println(output);
		
		String input1 = "Ashwini Kulkarni";
		System.out.println(input1);
		String output1 = input1.replace("Kulkarni", "Koteshwara");
		System.out.println(output1);
		
		String input2 ="Evere 11 S 1";
		String output2 = input2.replaceAll("[0-9]", "9");
		System.out.println(output2);
		
		
		
		
		

	}

}
