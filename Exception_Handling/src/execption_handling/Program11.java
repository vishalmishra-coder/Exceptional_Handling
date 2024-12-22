package execption_handling;
import java.util.Scanner;
public class Program11 {
	public static void main(String[] args) {
		System.out.println("Programs Starts");
		for(int i=1; i<=10; i++) {
			System.out.println(i);
			try {
			Thread.sleep(800);
			}
			catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
			
		}
		System.out.println("Program Ends");
	}
	

}
