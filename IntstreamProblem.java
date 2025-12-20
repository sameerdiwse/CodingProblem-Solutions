public class IntstreamProblem
{
	public static void main(String[] args) {
	// Find the vowels in the string	
	String str = "SomeString";
	Character c;
	int count = 0;
		for(int i = 0; i<str.length(); i++)
		{
			c = Character.toLowerCase(str.charAt(i));
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
				count++;		
			}
		}
		System.out.println("this is the count of vowels: "+count);
	}	
}
