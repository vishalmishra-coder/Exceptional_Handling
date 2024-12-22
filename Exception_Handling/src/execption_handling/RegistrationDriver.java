package execption_handling;
import java.util.Scanner;
public class RegistrationDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		try {
			
			Registration.checkEligibility(age);
		}
		catch(Exception e) {
			System.out.println("Message is : " + e.getMessage());
			System.out.println(e);
			e.printStackTrace();
		}
		
		System.out.println("Program Ends !! ");
	}
	

}
