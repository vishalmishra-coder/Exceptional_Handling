package execption_handling;
import java.util.Scanner;
public class Program10 {
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
			System.out.println("try block ends");
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
