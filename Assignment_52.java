package Basics;
//WAP on Multi Level Inheritance using Interface Concept

interface Contributor
{
	void one();
	void two();
}
interface Coordinator extends Contributor
{
	void three();
	void four();
}
public class Assignment_52 implements Coordinator {
	
	static void publisher()
	{
		System.out.println("CM 1");
	}
	static void editor()
	{
		System.out.println("CM 2");
	}

	public static void main(String[] args) {
		

	}
	@Override
	public void one() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void two() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void three() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void four() {
		// TODO Auto-generated method stub
		
	}

}
