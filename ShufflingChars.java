import java.lang.String;
import java.util.List;
import java.util.ArrayList;

class ShufflingChars
{
	public static void main(String[] args)
	{
		 List<String> shuffledNames = shuffleString("sameer");
		 for(String s : shuffledNames)
		 {
			 System.out.println(s);
		 }
	}
	
	public static List<String> shuffleString(String str)
	{
		List<String> shuffled = new ArrayList<>();
		String name = "";
		for(int i = 0; i<str.length(); i++)
		{
			for(int j = i+1; j < str.length()-1; j++)
			{
				for(int k = j+1; k<str.length()-2; k++)
				{
					
					name = str.charAt(i)+str.charAt(j)+str.charAt(k);
					shuffled.add(name);
					
				}
			}
		}
		return shuffled;
	}
}