package execption_handling;

public class Program16 {
	public static void main(String[] args) {
		try {
			Program15.printNumber(12);
			
		}
		catch(Exception e) {
			System.out.println("Exception Caught!!");
		}
		System.out.println("Program Ends !!");
	}

}
