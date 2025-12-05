import java.util.HashMap;
import java.util.stream.IntStream;

public class StringProblem
{
public static void main(String[] args) {
	
		//String str = "hello";
		//
		//HashMap<Character, Integer> hm = new HashMap<>();
		//for(int i = 0; i<=str.length()-1; i++)
		//{
		//	if(hm.containsKey(str.charAt(i)))
		//	{
		//		hm.put(str.charAt(i), hm.get(str.charAt(i))+1);	
		//	}
		//	else
		//{
		//	hm.put(str.charAt(i), 1);	
		//}
		//}
		//System.out.println("this is hm: "+hm);

		String name = "Sameer"; 

		StringBuffer sb = new StringBuffer();
		IntStream.range(0, name.length()).filter(i->i%2!=0).mapToObj(i->name.charAt(i)).forEach(i->sb.append(i));
		System.out.println(sb);

}
}
