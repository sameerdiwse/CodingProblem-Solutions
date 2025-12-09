import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
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

		// String name = "Sameer"; 

		//StringBuffer sb = new StringBuffer();
		//IntStream.range(0, name.length()).filter(i->i%2!=0).mapToObj(i->name.charAt(i)).forEach(i->sb.append(i));
		//System.out.println(sb);

		//Reverse the string using IntStream
		//String updatedName = IntStream.range(0, name.length()).mapToObj(i->name.charAt(name.length()-1-i)).map(String::valueOf).
		//collect(Collectors.joining());
		//System.out.println("this is reversed name: "+updatedName);
		String str = "What if everyone is asleep on earth!!";
		Map<Object, Long> charsMap = str.chars().filter(i->i!=' ').mapToObj(i -> (char) i).collect(Collectors.groupingBy(e->e, Collectors.counting()));
		charsMap.forEach((a, b)->
		{
				System.out.println(a+"->"+b);
		});


}
}
