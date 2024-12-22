package execption_handling;

public class Program2 {
	
	//StringIndexOutOfBoundsException
	public static void main(String[] args) {
		String s1 = "Mohan is here";
		System.out.println("Programs Starts");
		System.out.println(12+40*8);
		
		try {
			System.out.println(s1.charAt(24));
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(18+430*8);
		System.out.println(12+70*9);
		System.out.println("Progarm Ends");
	}

}
