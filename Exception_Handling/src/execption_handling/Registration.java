package execption_handling;

public class Registration
{
	public static void checkEligibility(int age)throws UnderAgeException 
	{
		if(age>=18) 
		{
			System.out.println("You are eligible for registration");
			
		}
		
		else 
		{
			throw new UnderAgeException("You under age");
		}
		
	}

}
