public class Voting
{

	public static void main(String [] args)
	{
		int age = 18;
			  if(age < 15)
			  {
				  try
					  { 
					  throw new CustomEx("You are not eligible to vote.");
					  }
				  catch(CustomEx e)
					  {
						 e.printStackTrace(); 
					  }
			  }	
	}
    

}