import java.util.HashMap;

public class StringProblem
{
public static void main(String[] args) {
	
		String str = "hello";

		HashMap<Character, Integer> hm = new HashMap<>();
		for(int i = 0; i<=str.length()-1; i++)
		{
			if(hm.containsKey(str.charAt(i)))
			{
				hm.put(str.charAt(i), hm.get(str.charAt(i))+1);	
			}
			else
		{
			hm.put(str.charAt(i), 1);	
		}
		}
		System.out.println("this is hm: "+hm);

}
}
