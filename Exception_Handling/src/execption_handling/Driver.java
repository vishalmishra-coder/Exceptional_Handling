package execption_handling;

public class Driver {
	public static void main(String[]  args) {
		System.out.println("Program Starts");
		try {
		Test.getResult(12,0);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}
		System.out.println("Programs Ends");
	}

}
