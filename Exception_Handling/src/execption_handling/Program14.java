package execption_handling;

public class Program14
{
	public static void main(String[] args) 
	{
		System.out.println("Main Methods Starts");
		try
		{
			printNumber(10);
		}
		catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Main Method Ends");
	}
	
	public static void printNumber(int n)throws InterruptedException , ArithmeticException
	{
		for(int i =1; i<=n; i++)
		{
			System.out.println(i);
			Thread.sleep(700);
			
		}
		
	}

}
