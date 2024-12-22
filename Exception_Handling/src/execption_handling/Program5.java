package execption_handling;
import java.util.Scanner;
public class Program5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number a : ");
		int a = sc.nextInt();
		System.out.println("Enter a number b : ");
		int b = sc.nextInt();
		System.out.println( a + "+" + b + "=" + (a + b));
		System.out.println( a + "+" + b + "=" + (a - b));
		try {
			System.out.println("try block starts");
			System.out.println(a/b);
			System.out.println("try block ends");
		}
		catch(ArithmeticException e) 
		{
			System.out.println("================Catch Block===================");
			System.out.println(e);
			System.out.println(e.getMessage());
			System.out.println("=============================================");
			e.printStackTrace();
			System.out.println("=============================================");
			
		}
		catch(Exception e) 
		{
			System.out.println("Other exception is caught");
		
		}
		
		System.out.println(a + "*" + b + "=" + (a * b));
		System.out.println("Program Ends");
	}

}
