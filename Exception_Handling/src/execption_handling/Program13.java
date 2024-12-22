package execption_handling;

public class Program13 {
	
//	Error
	public static void main(String[] args)
	{
		test();
	}
	public static void test() 
	{
		System.out.println("This is a test method");
		test();
	}

}
