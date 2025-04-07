package Basics;

 class ClassAS4 {
	
	public static void LoginPage1()
	{
		System.out.println("This is login page1");
	}
	protected static void HomePage1()
	{
		System.out.println("This is Home page1");
	}
	 void AccountPage1()
	{
		System.out.println("This is Account page1");
	}
	 private  void StoryPage1()
		{
			System.out.println("This is Story page");
		}

	public static void main(String[] args) {
		
		LoginPage1();
		HomePage1();
		ClassAS4 RF = new ClassAS4();
		RF.AccountPage1();
		RF.StoryPage1();

	}

}
