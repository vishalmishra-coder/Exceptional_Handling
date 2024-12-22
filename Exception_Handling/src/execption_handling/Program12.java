package execption_handling;
import java.util.Scanner;
public class Program12 {
	public static void main(String[] args)throws InterruptedException
	{
		System.out.println("Program Start");
		for(int i=1; i<=10; i++) 
		{
			System.out.println(i);
			Thread.sleep(800);
		}
		System.out.println("Program Ends");
	}

}
