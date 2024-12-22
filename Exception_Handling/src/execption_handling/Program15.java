package execption_handling;
import java.util.Scanner;
public class Program15 
{
	public static void main(String[] args) {
		System.out.println("Program Start");
		try {
			printNumber(10);
			
		}
		catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Programs Ends!!");
	}
	public static void printNumber(int n) throws InterruptedException{
		for(int i=1; i<=n; i++) {
			System.out.println(i);
			Thread.sleep(700);
		}
	}
	
	
	

}
