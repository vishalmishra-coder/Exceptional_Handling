package execption_handling;
import java.util.Scanner;
public class OddEven {
	public static void checkEven(int n)throws OddException {
		if(n%2==0)
		{
			System.out.println(n + " is a Even Number");
		}
		else {
			throw new OddException("Odd Number");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		try {
			checkEven(n);
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Program Ends !!");
		
	}

}
