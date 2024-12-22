package execption_handling;
import java.util.Scanner;
public class Program7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number a : ");
		int a = sc.nextInt();
		System.out.println("Enter a number b : ");
		int b = sc.nextInt();
		System.out.println(a + "+" + b + "=" + (a + b));
		System.out.println(a + "-" + b + "=" + (a - b));
		try {
			System.out.println("try block starts here :");
			System.out.println(a/b);
			System.exit(0);
			System.out.println("try block ends");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("finally starts");
			sc.close();
			System.out.println("finally ends");
		}
		System.out.println(a + " * " + b + " = " + (a * b));
		System.out.println("Program Ends!!");
	}

}
