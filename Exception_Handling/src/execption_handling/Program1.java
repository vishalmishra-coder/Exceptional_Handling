package execption_handling;

public class Program1 {
	
	//ArithmeticException
	public static void main(String[] args) {
		System.out.println("Program Starts");
		System.out.println(12+40*8);
		try {
			System.out.println(12+40/0);
			
		}
		catch(ArithmeticException a) {
			//System.out.println("Infinte");
			System.out.println(a.getMessage());
		}
		System.out.println(56+67*2);
		System.out.println(13+89);
		System.out.println("Program Ends");
	}

}
