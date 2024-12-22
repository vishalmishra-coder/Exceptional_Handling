package execption_handling;
import java.util.Scanner;
public class Program4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number one : ");
		int a = sc.nextInt();
		System.out.println("Enter a number second : ");
		int b = sc.nextInt();
		System.out.println(a + "+" +b + "=" + (a+b));
		System.out.println(a+"-" +b+"="+(a-b));
		System.out.println(a + "*" + b + "=" + (a*b));
		try {
			System.out.println(a + "/" + b + "=" + (a/b));
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Program Ends");
        sc.close();
		
		
		
		
		
		
		
		
		
		
	}

}
