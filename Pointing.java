import java.util.stream.*;
import java.util.*;
import java.lang.Integer;
class Pointing
{
  public static boolean isPrime(int i)
  {
	if(i<2)
	{
		return false;
	}
	for(int n = 2; n<=i/2; n++)
	{
		if(i%n==0)
		{
			return false;
		}
	}
	return true;
  }	
	
  public static void main(String [] args)
  {
    for(int i = 0; i<101; i++)
	{
		if(isPrime(i))
		{
			System.out.println(i + " is a prime number.");
		}
	}		
  }
}