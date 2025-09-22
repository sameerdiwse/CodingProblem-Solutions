public class Voting
{

	public static void main(String [] args)
	{
		int age = 18;
			  if(age < 15)
			  {
				  try
					  { 
					  throw new CustomEx("You are not eligible to vote, you are under 18.");
					  }
				  catch(CustomEx e)
					  {
						 e.printStackTrace(); 
					  }
			  }	
			  System.out.println("this is just a class.");
	}
    

}