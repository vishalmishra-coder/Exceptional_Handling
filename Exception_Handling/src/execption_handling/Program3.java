package execption_handling;

public class Program3 {
	//ArrayIndexOutOfBoundsException
	public static void main(String[] args) {
		int[] a = {12, 36 ,77 ,56 , 20 ,32};
		System.out.println("Program Starts");
		System.out.println(12+40*8);
		try {
			System.out.println(a[12]);
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(20+30*2);
		System.out.println(56+73*4);
		System.out.println("Program Ends");
	}

}
